class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> l = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> e:map.entrySet()) {
            if(e.getValue() > nums.length / 3) {
                l.add(e.getKey());
            }
        }
        return l;
    }
}