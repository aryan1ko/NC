class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();

        for(String s : strs) {
            int[] arr = new int[26];
            for(int i = 0; i < s.length(); i++) {
                arr[s.charAt(i) - 'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for(int num : arr) {
                sb.append(num).append('#');
            }
            String key = sb.toString();

            if(!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(s);
        }


            result.addAll(map.values());


        return result;
    }
}
