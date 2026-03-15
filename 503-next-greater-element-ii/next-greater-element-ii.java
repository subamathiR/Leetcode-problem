import java.util.*;

class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int r[] = new int[nums.length];
        Arrays.fill(r, -1);   
        
        for(int i = 0; i < 2 * nums.length; i++){
            int index = i % nums.length;   
            
            while(!stack.isEmpty() && nums[stack.peek()] < nums[index]){
                r[stack.pop()] = nums[index];
            }
            
            if(i < nums.length){  
                stack.push(index);
            }
        }
        
        return r;
    }
}