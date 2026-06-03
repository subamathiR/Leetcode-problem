class Solution {
    public int largestInteger(int num) {
        char ch[] = String.valueOf(num).toCharArray();
        int f[] = new int[10];
        for(char c:ch){
            f[c-'0']++;
        }
        StringBuilder sb = new StringBuilder();
        for(char c:ch){
            int digit = c-'0';
            if(digit%2==0){
                for(int d = 8;d>=0;d-=2){
                    if(f[d]>0){
                    sb.append(d);
                    f[d]--;
                    break;
                }}
            }
            else{
                for(int d = 9;d>=1;d-=2){
                    if(f[d]>0){
                    sb.append(d);
                    f[d]--;
                    break;
                }}
            }
        }
        return Integer.parseInt(sb.toString());
    }
}