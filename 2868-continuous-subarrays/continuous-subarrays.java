import java.util.*;
class Solution {
    public long continuousSubarrays(int[] nums) {
        int left = 0;
        long count = 0;
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int right = 0; right < nums.length; right++) {
            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);
            while (map.lastKey() - map.firstKey() > 2) {
                int value = nums[left];
                map.put(value, map.get(value) - 1);
                if (map.get(value) == 0) {
                    map.remove(value);
                }
                left++;
            }
            count += right - left + 1;
        }
        return count;
    }
}