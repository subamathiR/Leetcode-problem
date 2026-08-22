class Solution {
    public boolean checkDivisibility(int n) {
        long t = n;
        long sum = 0;
        long product = 1;
        while(n>0){
            int d = n%10;
            sum+=d;
            product*=d;
            n/=10;
        }
        return t%(sum+product) == 0;
        
    }
}