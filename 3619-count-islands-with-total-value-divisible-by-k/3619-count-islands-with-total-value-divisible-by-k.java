class Solution {
    public int countIslands(int[][] grid, int k) {
        int n = grid.length;
        int m = grid[0].length;
        int ans =0;
        boolean[][] vis = new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]!=0 && !vis[i][j]){
                    long val = summing(grid,i,j,vis);
                    if(val%k==0){
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
    static long summing(int[][] grid,int i,int j,boolean[][] vis){
        int n = grid.length;
        int m = grid[0].length;
        if (i < 0 || j < 0 || i >= n || j >= m
                || grid[i][j] == 0 || vis[i][j]) {
            return 0;
        }
        vis[i][j]=true;
        long right = summing(grid,i+1,j,vis);
        long down = summing(grid,i,j+1,vis);
        long left = summing(grid,i-1,j,vis);
        long top = summing(grid,i,j-1,vis);
        return grid[i][j]+right+down+left+top;
    }
}