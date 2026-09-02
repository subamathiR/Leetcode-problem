class Solution {
    public int[] productExceptSelf(int[] nums) {
        int a[] = new int[nums.length];
        int pl = 1;
        int pr = 1;
        for(int i=0;i<nums.length;i++){
            a[i] = pl;
            pl *= nums[i];
        }
        for(int i = nums.length-1;i>=0;i--){
            a[i] *= pr;
            pr *= nums[i];
        }
        return a;
    }
}