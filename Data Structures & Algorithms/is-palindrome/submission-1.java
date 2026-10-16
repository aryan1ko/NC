class Solution {
    public boolean isPalindrome(String s) {
        String str = s.toLowerCase();
        // char[] arr = str.toCharArray();
        int left = 0;
        int right = s.length() - 1;

        while(right > left) {
            if(!Character.isLetterOrDigit(str.charAt(left))) {
                left++;
            }
            else if(!Character.isLetterOrDigit(str.charAt(right))) {
                right--;
            }
            else if(str.charAt(left) != str.charAt(right)) {
                return false;
            }
            else {
                left++;
                right--;
            }
        }

        return true;
    }
}
