class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for(String str : strs) {
            int[] freqMap = new int[26];
            for(Character ch : str.toCharArray()) {
                freqMap[ch - 'a']++;
            }

            // convert freqMap to string to use as key
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < 26; i++) {
                if(freqMap[i] != 0) {
                    sb.append(i);
                    sb.append("*");
                    sb.append(freqMap[i]);
                    sb.append("*");
                }
            }
            // freqMap is now converted to string
            String key = sb.toString();

            if(map.containsKey(key)) {
                List<String> wordList = map.get(key);
                wordList.add(str);
            }
            else {
                List<String> wordList = new ArrayList<>();
                wordList.add(str);
            }
        }

        List<List<String>> res = new ArrayList<>();
        for(String key : map.keySet()) {
            res.add(map.get(key));
        }

        return res;
    }
}
