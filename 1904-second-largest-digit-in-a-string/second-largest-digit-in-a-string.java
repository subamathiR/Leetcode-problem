class Solution {
    public int secondHighest(String s) {
        int first = -1;
        int second = -1;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                int d = ch-'0';
                if(d > first){
                    second = first;
                    first = d;
                }
                else if(d < first && d > second){
                     second = d;
                }
            }
        }
        return second;
    }
}