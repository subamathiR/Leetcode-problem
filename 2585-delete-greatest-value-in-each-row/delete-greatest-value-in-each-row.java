class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        for(int i=0;i<n;i++){
            Arrays.sort(grid[i]);
        }
        int ans = 0;
        for(int j = m-1;j>=0;j--){
            int max = 0;
            for(int i=0;i<n;i++){
                max = Math.max(max,grid[i][j]);
            }
            ans+=max;
        }
        return ans;
    }
}