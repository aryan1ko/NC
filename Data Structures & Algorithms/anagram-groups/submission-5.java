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

            if(map.containsKey(sb.toString())) {
                List<String> wordList = map.get(sb.toString());
                wordList.add(str);
                map.put(sb.toString(), wordList);
            }
            else {
                List<String> wordList = new ArrayList<>();
                wordList.add(str);
                map.put(sb.toString(), wordList);
            }
        }

        List<List<String>> res = new ArrayList<>();
        for(String key : map.keySet()) {
            res.add(map.get(key));
        }

        return res;
    }
}
