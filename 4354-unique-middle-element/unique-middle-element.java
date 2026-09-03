class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int n = nums.length;
        int middle = n / 2;
        for (int i = 0; i < n; i++) {
            if (i != middle && nums[i] == nums[middle]) {
                return false;
            }
        }
        return true;
    }
}