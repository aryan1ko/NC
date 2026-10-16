class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<>();
        ArrayDeque<Character> stack = new ArrayDeque<>();

        if(s.length() == 0) {
            return true;
        }

        map.put('}', '{');
        map.put(')', '(');
        map.put(']', '[');

        int i = 0;


        while(i < s.length()) {
            if(!stack.isEmpty()) {
                if(stack.peek() == map.get(s.charAt(i))) {
                    stack.pop();
                }
                else {
                    stack.push(s.charAt(i));
                }
                i++;
            }
            else {
                stack.push(s.charAt(i));
                i++;
            }
        }

        if(!stack.isEmpty()) {
            return false;
        }
        return true;

    }
}
