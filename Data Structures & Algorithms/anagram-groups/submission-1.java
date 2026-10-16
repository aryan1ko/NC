class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Map<List<Integer>, List<String>> map = new HashMap<>();

        for(String s : strs) {
            int[] arr = new int[26];
            for(int i = 0; i < s.length(); i++) {
                arr[s.charAt(i) - 'a']++;
            }
            List<Integer> key = new ArrayList<>();
            for (int i = 0; i < 26; i++) {
                key.add(arr[i]);
            }


            if(!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(s);
        }


            result.addAll(map.values());


        return result;
    }
}
