class Solution {
    public int findGCD(int[] nums) {
       int min = nums[0];
       int max = nums[0];
       for(int i=0;i<nums.length;i++){
        min = Math.min(min,nums[i]);
        max = Math.max(max,nums[i]);
       }
       int a = min;
       int b = max;
       while(b!=0){
        int t = b;
        b = a%b;
        a = t;
       }
       return a;
    }
}