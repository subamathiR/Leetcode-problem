class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        int[] r = new int[k];
        for (int x = 0; x < k; x++) {
            int maxfreq = 0;
            int maxelement = 0;
            for (int num : map.keySet()) {
                if (map.get(num) > maxfreq) {
                    maxfreq = map.get(num);
                    maxelement = num;
                }
            }
            r[x] = maxelement;
            map.remove(maxelement);
        }
        return r;
    }
}