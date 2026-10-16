class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        int len = s.length();

        int[] arr1 = new int[len];
        int[] arr2 = new int[len];

        for(int i = 0; i < len; i++) {
            arr1[i] = (int) s.charAt(i);
        }

        for(int i = 0; i < len; i++) {
            arr2[i] = (int) t.charAt(i);
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        for(int i = 0; i < len; i++) {
            if(arr1[i] != arr2[i]) return false;
        }
        return true;
    }
}
