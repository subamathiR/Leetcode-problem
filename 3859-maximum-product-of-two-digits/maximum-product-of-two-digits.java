class Solution {
    public int maxProduct(int n) {
        int fm = 0;
        int sm = 0;
        while(n>0){
            int d = n%10;
            if(d>=fm){
                sm = fm;
                fm = d;
            }
            else if(d>=sm){
                sm = d;
            }
            n/=10;
        }
        return fm*sm;
    }
}
