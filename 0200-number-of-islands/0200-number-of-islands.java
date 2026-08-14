class Solution {
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int island = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == '1') {
                    island++;
                    dfs(i, j, grid);
                }
            }
        }
        return island;
    }
    // O(N*M) TC

    private void dfs(int row, int col, char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        //  this is for the direction
        int[] dx = { -1, 0, 1, 0 };
        int[] dy = { 0, 1, 0, -1 };

        if (row >= 0 && row < n && col < m && col >= 0 && grid[row][col] == '1') {
            grid[row][col] = '.';
            for (int i = 0; i < 4; i++) {
                dfs(row + dx[i], col + dy[i], grid);
            }
        }
    }
}