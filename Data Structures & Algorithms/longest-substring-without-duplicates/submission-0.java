class Solution {
    public int lengthOfLongestSubstring(String s) {
        // char[] arr = s.toCharArray();
        // to track characters to ensure no duplicates
        Set<Character> set = new HashSet<>();
        //left and right indices
        int left = 0;
        int right = 1;
        int maxLen = 0;

        set.add(s.charAt(left));
        while(set.contains(s.charAt(right))) {
            if(right == s.length() - 1) return 1;
            right++;
            set.remove(s.charAt(left));
            left++;
            set.add(s.charAt(left));
        }
        maxLen = 2;
        set.add(s.charAt(right));

        while(right != s.length() - 1) {
            if(!set.contains(s.charAt(right + 1))) {
                right++;
                set.add(s.charAt(right));
                maxLen = Math.max(maxLen, set.size());
            } else {
                while(set.contains(s.charAt(right + 1))) {
                    set.remove(s.charAt(left));
                    left++;
                }
                set.add(s.charAt(right));
                right++;
                set.add(s.charAt(right));
            }
        }

        return maxLen;
    }
}
