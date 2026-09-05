class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int maxCnt = 0;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(grid[i][j] == 1){
                   int x = dfs(i,j,grid);
                   maxCnt = Math.max(maxCnt,x);
                }
            }
        }
        return maxCnt;
    }
    private int  dfs(int row ,int col, int[][] grid){
        int n = grid.length;
        int m = grid[0].length;


        int[] dx = {-1,0,1,0};
        int[] dy = {0,1,0,-1};
        

        if (row < 0 || row >= n ||
            col < 0 || col >= m ||
            grid[row][col] != 1) {
            return 0;
        }
        grid[row][col] = 2;
        int cnt = 1;
        for (int i = 0; i < 4; i++) {
            cnt += dfs(row + dx[i], col + dy[i], grid);
        }
        
        return cnt;
    }
}