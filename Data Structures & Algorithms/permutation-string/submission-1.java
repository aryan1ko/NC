class Solution {
    public boolean checkInclusion(String s1, String s2) {
        //2 different maps
        // 1 hashmap for s1
        // another hashmap for the sliding window in s2
        if(s1.length() > s2.length()) {
            return false;
        }

        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        //construct map for s1;
        for(char c: s1.toCharArray()) {
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }

        for(int i = 0; i + s1.length() <= s2.length(); i++) {
            map2.clear();
            for(char c: s2.substring(i, i + s1.length()).toCharArray()) {
                map2.put(c, map2.getOrDefault(c, 0) + 1);
            }
            if(map1.equals(map2)) return true;
        }

        return false;
    }
}
