class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> map = new HashMap<>();
        int left = 0;
        int res = 0;
        int maxFreq = 0;

        for(int right = 0; right < s.length(); right++) {
            //put right in the map
            map.put(s.charAt(right), map.getOrDefault(s.charAt(right), 0) + 1);
            //find maxFreq
            for(char c : map.keySet()) {
                if(map.get(c) > maxFreq) {
                    maxFreq = map.get(c);
                }
            }

            while(right - left + 1 - maxFreq > k) {
                //invalid window
                //decrement L pos in map
                map.put(s.charAt(left), map.get(s.charAt(left)) - 1);
                //shift L
                left++;
                
            }
            res = Math.max(res, right - left + 1);
        }

        return res;
    }
}
