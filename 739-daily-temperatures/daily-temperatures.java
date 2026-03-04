import java.util.Stack;

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[temperatures.length];
        
        for(int i = 0; i < temperatures.length; i++) {
            
            while(!stack.isEmpty() &&  temperatures[i] > temperatures[stack.peek()]) {
                
                int last = stack.pop();
                ans[last] = i - last;
            }
            
            stack.push(i);
        }
        
        return ans;
    }
}