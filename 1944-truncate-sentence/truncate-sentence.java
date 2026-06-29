class Solution {
    public String truncateSentence(String s, int k) {
        String w[] = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<k;i++){
            sb.append(w[i]);
            if(i!=k-1){
               sb.append(" ");
            }
        }
        return sb.toString();
    }
}