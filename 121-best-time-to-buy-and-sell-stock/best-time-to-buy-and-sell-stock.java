class Solution {
    public int maxProfit(int[] prices) {
       int max = 0;
       int bp = prices[0];
       for(int i=0;i<prices.length;i++){
          int c = prices[i]-bp;
          if(c>max){
            max =  c;
          }
          if(prices[i] < bp){
            bp = prices[i];
          }
       }
       return max;
    }

}