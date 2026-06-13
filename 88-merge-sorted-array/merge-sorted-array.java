class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int c[] = new int[m+n];
        int k = 0;
        for(int i=0;i<m;i++){
            c[k++] = nums1[i];
        }
        for(int i=0;i<n;i++){
            c[k++] = nums2[i];
        }
        Arrays.sort(c);
        for(int i=0;i<m+n;i++){
            nums1[i] = c[i];
        }
    }
}