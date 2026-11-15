
class Solution {
    public int findLucky(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        int ans = -1;

        for(Map.Entry<Integer, Integer> e : map.entrySet()) {
            int num = e.getKey();
            int count = e.getValue();

            if(num == count) {
                ans = Math.max(ans, num);
            }
        }

        return ans;
    }
}
