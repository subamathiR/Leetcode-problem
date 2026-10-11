class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length;
        int s = 0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j+=2){
                for(int k=i;k<=j;k++){
                    s+=arr[k];
                }
            }
        }
        return s;
    }
}