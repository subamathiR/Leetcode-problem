class Solution {
    public int minFlips(String target) {
        int c = 0;
        char prev = '0';
        for(int i=0;i<target.length();i++){
            char ch = target.charAt(i);
            if(ch != prev){
                c++;
                prev = ch;
            }
        }
        return c;
    }
}