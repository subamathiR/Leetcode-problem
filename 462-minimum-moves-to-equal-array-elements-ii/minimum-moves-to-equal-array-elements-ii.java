class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int min = 0;
        int median = nums[nums.length/2];
        for(int n:nums){
            min+=Math.abs(n-median);
        }
        return min;
    }
}