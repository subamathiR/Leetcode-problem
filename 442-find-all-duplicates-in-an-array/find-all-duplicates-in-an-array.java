class Solution {
    public List<Integer> findDuplicates(int[] nums) {
       List<Integer> res = new ArrayList<>();
       Map<Integer,Integer> map = new HashMap<>();
       for(int i : nums){
        map.put(i,map.getOrDefault(i,0)+1);
       }
       for(Map.Entry<Integer,Integer> e : map.entrySet()){
        if(e.getValue() > 1){
            res.add(e.getKey());
        }
       }
       return res;
    }
}