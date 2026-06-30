class Solution {
    public int jump(int[] nums) {

        int jumps = 0;
        int currentEnd = 0;
        int maxReach = 0;

        for(int i = 0; i < nums.length - 1; i++) {

            // find the farthest we can go
            maxReach = Math.max(maxReach, i + nums[i]);

            // if current jump is finished
            if(i == currentEnd) {

                jumps++;

                currentEnd = maxReach;
            }
        }

        return jumps;
    }
}