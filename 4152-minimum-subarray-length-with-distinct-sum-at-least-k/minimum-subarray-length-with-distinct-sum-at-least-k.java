class Solution {
    public int minLength(int[] nums, int k) {
        int l = 0;
        long sum = 0;
        int min = Integer.MAX_VALUE;
        int[] freq = new int[100001];
        for (int r = 0; r < nums.length; r++) {
            if (freq[nums[r]] == 0) {
                sum += nums[r];
            }
            freq[nums[r]]++;
            while (sum >= k) {
                min = Math.min(min, r - l + 1);
                freq[nums[l]]--;
                if (freq[nums[l]] == 0) {
                    sum -= nums[l];
                }
                l++;
            }
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }
}