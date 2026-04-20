class Solution {
    public int mirrorDistance(int n) {
        int r = 0;
        int t = n;
      while(n!=0){
         int d = n%10;
         r = (r*10)+d;
         n/=10;
      }
      int ans = Math.abs(t-r);
      return ans;
    }
}