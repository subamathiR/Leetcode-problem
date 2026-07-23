class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int n = nums.length;
        if(n<3)
        return n;
        int p = 1;
        while(p<=n)
        p = p<<=1;
        return p;
    }
}