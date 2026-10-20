class Solution {
    public int[] lastVisitedCell(char[][] grid) {
        int n = grid.length , m = grid[0].length;
        int x = 0 , y = 0;
        boolean[][] visited = new boolean[n][m];

        while(true){
            visited[x][y] = true;
            int nx = x , ny = y;

            if(grid[x][y] == 'L') ny--;
            else if(grid[x][y] == 'R') ny++;
            else if(grid[x][y] == 'U') nx--;
            else  nx++;

            if(ny < 0 || ny >= m || nx < 0 || nx >= n) break;
            if(visited[nx][ny]) break;
            x = nx;
            y = ny;
        }
        return new int[]{x,y};
    }
}