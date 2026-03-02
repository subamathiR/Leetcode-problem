class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        
        for(String s : strs){
            char ch[] = s.toCharArray();
            Arrays.sort(ch);
            String sortedstring = new String(ch);
            
            if(map.containsKey(sortedstring) == false){
                map.put(sortedstring, new ArrayList<>());
            }
            
            map.get(sortedstring).add(s);
        }
        
        result.addAll(map.values());   
        
        return result;
    }
}