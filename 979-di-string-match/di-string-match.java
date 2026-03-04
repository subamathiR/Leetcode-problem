class Solution {
    public int[] diStringMatch(String s) {
        int result[] = new int[s.length()+1];
        int l = 0;
        int r = s.length();
        int index = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='I'){
                result[index++] = l++;
            }
            else{
                result[index++] = r--;
            }
        }
        if(s.charAt(s.length()-1)=='I'){
            result[index] = l;
        }else{
            result[index] = r;
        }
        return result;
    }
}