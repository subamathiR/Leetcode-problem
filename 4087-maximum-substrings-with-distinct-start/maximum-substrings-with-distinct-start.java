class Solution {
    public int maxDistinct(String s) {
        HashSet<Character> set = new HashSet<>();
        int c = 0;
        for(char ch : s.toCharArray()){
            set.add(ch);
        }
        for(char ch : set){
            c++;
        }
        return c;
    }
}