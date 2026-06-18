class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> result = new ArrayList<>();
        for(String word:words){
            if(check(word,pattern)){
                result.add(word);
            }
        }
        return result;
    }
    public boolean check(String word,String pattern){
        Map<Character,Character> map = new HashMap<>();
        for(int i=0;i<word.length();i++){
            char k = word.charAt(i);
            char v = pattern.charAt(i);
            if(map.containsKey(k)){
                if(map.get(k)!=v){
                    return false;
                }
            }
            else{
                if(map.containsValue(v)){
                    return false;
                }
                map.put(k,v);
            }
        }
        return true;
    }
}