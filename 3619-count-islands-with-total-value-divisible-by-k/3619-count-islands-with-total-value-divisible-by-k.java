class Solution {
    public int countIslands(int[][] grid, int k) {
        int n = grid.length;
        int m = grid[0].length;
        int cnt = 0;
        long crt = 0;

        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ;  j < m ; j++){
                if(grid[i][j] >= 1){
                   crt = dfs(i,j,grid,k);
                   if(crt % k == 0) cnt++;
                }
            }
        }
        return cnt;
    }
    private long dfs(int row,int col , int[][] grid,int k){
        int n = grid.length;
        int m = grid[0].length;
        long sum = 0;

        int[] dx = {-1,0,1,0};
        int[] dy = {0,1,0,-1};

        if(row >= 0 && row < n && col >= 0 && col < m && grid[row][col] >= 1){
           sum += grid[row][col];
            grid[row][col] = -1;
                for(int i =0 ; i < 4 ; i++){
                    sum += dfs(row+dx[i] , col+dy[i] , grid , k);
             }
        }
        return sum;
    }
}