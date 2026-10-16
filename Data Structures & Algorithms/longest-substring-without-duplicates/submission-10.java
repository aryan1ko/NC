class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s == null || s.length() == 0) {
            return 0;
        }

        Set<Character> set = new HashSet<>();

        int l = 0;
        int r = 0;
        int max = 0;

        while(r < s.length()) {
            if(set.contains(s.charAt(r))) {
                set.remove(s.charAt(l));
                l++;
            } else {
                set.add(s.charAt(r));
                max = Math.max(r - l + 1, max);
                r++;
            }
        }

        return max;
    }
}
