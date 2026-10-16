class Solution {
    public String minWindow(String s, String t) {
        Map<Character, Integer> map_s = new HashMap<>();
        Map<Character, Integer> map_t = new HashMap<>();


        for(char c : t.toCharArray()) {
            map_t.put(c, map_t.getOrDefault(c, 0) + 1);
        }
        
        int left = 0;
        int bestLen = Integer.MAX_VALUE;
        int bestStart = 0;
        
        for(int right = 0; right < s.length(); right++) {
            char rc = s.charAt(right);
            map_s.put(rc, map_s.getOrDefault(rc, 0) + 1);

            while(subtract_str(map_s, map_t)) {
                int len = right - left + 1;

                if(len < bestLen) {
                    bestLen = len;
                    bestStart = left;
                }

                char lc = s.charAt(left);
                map_s.put(lc, map_s.get(lc) - 1);
                left++;
            }
        }

        return bestLen == Integer.MAX_VALUE ? "" : s.substring(bestStart, bestStart + bestLen);

    }

    //returns true if the entirity of map_t is contained in map_s, otherwise false
    private boolean subtract_str(Map<Character, Integer> map_s, Map<Character, Integer> map_t) {
        for(char key : map_t.keySet()) {
            if(!map_s.keySet().contains(key)) {
                return false;
            } else {
                if(map_s.get(key) < map_t.get(key)) {
                    return false;
                }
            }
        }

        return true;
    }
}
