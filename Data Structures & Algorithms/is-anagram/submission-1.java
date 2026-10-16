class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        int len = s.length();



        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        
        for(int i = 0; i < len; i++) {
            if(arr1[i] != arr2[i]) return false;
        }
        return true;
    }
}
