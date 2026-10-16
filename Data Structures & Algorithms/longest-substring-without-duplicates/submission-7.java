class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.equals(null)) {
            return 0;
        }
        Set<Character> set = new HashSet<>();

        int l = 0;
        int r = 0;
        int max = 0;

        set.add(s.charAt(0));

        while(r < s.length() - 1) {
            r++;
            if(set.contains(s.charAt(r))) {
                while(set.contains(s.charAt(r))) {
                    set.remove(s.charAt(l));
                    l++;
                }
                set.add(s.charAt(r));
                max = Math.max(r - l + 1, max);
            } else {
                set.add(s.charAt(r));
                max = Math.max(r - l + 1, max);
            }
        }

        return max;
    }
}
