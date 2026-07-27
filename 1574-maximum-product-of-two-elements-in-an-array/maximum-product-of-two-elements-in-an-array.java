class Solution {
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        int n = nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
              int res = (nums[i]-1)*(nums[j]-1);
              max = Math.max(max,res);
            }
        }
        return max;
    }
}