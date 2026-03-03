class Solution {
    public int[] diStringMatch(String s) {
        int y=s.length();
        int[] arr=new int[y+1];
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='D'){
                arr[i]=y;
                y--;
            }
        }
        y=0;
        for(int i=0;i<s.length()+1;i++){
            if(arr[i]==0){
                arr[i]=y;
                y++;
            }
        }
        return arr;
    }
}