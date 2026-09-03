class Solution {
    public int maxDigitRange(int[] nums) {

        int maxRange = -1;
        int answer = 0;

        for (int num : nums) {

            int temp = num;
            int max = 0;
            int min = 9;

            while (temp > 0) {

                int digit = temp % 10;

                max = Math.max(max, digit);
                min = Math.min(min, digit);

                temp /= 10;
            }

            int range = max - min;

            if (range > maxRange) {
                maxRange = range;
                answer = num;
            }
            else if (range == maxRange) {
                answer += num;
            }
        }

        return answer;
    }
}