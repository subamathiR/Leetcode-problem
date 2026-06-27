class Solution {
    public int[] arrayChange(int[] nums, int[][] operations) {

        Map<Integer, Integer> map = new HashMap<>();

        // Store value -> index
        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        // Perform operations
        for(int[] op : operations) {

            int oldValue = op[0];
            int newValue = op[1];

            // Find index of old value
            int index = map.get(oldValue);

            // Replace in array
            nums[index] = newValue;

            // Update map
            map.remove(oldValue);
            map.put(newValue, index);
        }

        return nums;
    }
}