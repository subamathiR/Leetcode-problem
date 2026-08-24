class Solution {
    public int maxLength(int[] nums) {
        int n = nums.length;
        int ans = 1;
        for (int i = 0; i < n; i++) {
            long product = 1;
            long gcd = 0;
            long lcm = 1;
            for (int j = i; j < n; j++) {
                product *= nums[j];
                long a = gcd;
                long b = nums[j];
                while (b != 0) {
                    long temp = b;
                    b = a % b;
                    a = temp;
                }
                gcd = a;
                long x = lcm;
                long y = nums[j];
                while (y != 0) {
                    long temp = y;
                    y = x % y;
                    x = temp;
                }
                lcm = (lcm / x) * nums[j];
                if (product == lcm * gcd) {
                    ans = Math.max(ans, j - i + 1);
                }
            }
        }
        return ans;
    }
}