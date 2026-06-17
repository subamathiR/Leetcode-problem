class Solution {
    public int[] leftRightDifference(int[] nums) {
        int l[] = new int[nums.length];
        int r[] = new int[nums.length];
        int s = 0;
        for(int i=0;i<nums.length;i++){
            s+=nums[i];
            l[i] = s;
        }
        int s1 = 0;
        for(int i=nums.length-1;i>=0;i--){
            s1+=nums[i];
            r[i] = s1;
        }
        int a[] = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            a[i] = Math.abs(l[i]-r[i]);
        }
        return a;
    }
}