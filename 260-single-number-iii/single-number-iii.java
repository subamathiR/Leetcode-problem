class Solution {
    public int[] singleNumber(int[] nums) {
        List<Integer> res = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            if(e.getValue()==1){
                res.add(e.getKey());
            }
        }
        int a[] = new int[res.size()];
        for(int i=0;i<res.size();i++){
            a[i] = res.get(i);
        }
        return a;
    }
}