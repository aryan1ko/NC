class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<int[]> stack = new Stack<>();
        int[] res = new int[temperatures.length];
        int i = 1;

        stack.push(new int[] {0, temperatures[0]});

        while(i < temperatures.length) {
            while(!stack.empty()){
                if(temperatures[i] > stack.peek()[1]) {
                    int[] pair = stack.pop();
                    int index = pair[0];
                    res[index] = i - index;
                }
                else {
                    break;
                }
            }
            stack.push(new int[] {i, temperatures[i]});
            i++;
        }

        return res;
    }
}

//stack to hold index -> temp pair

// push first index -> temp pair on the stack

// int i = 0;
// while(stack not empty) {
    // if temp[i] is greater than top of stack
    //      pop off and update dist : i - pop[1]
    // else
    //      push i on stack 
//}