class Solution {
    int n , m;
    int[] dx = {-1,0,1,0};
    int[] dy = {0,1,0,-1};
    
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        n = heights.length;
        m = heights[0].length;

        boolean[][] pacific = new boolean[n][m];
        boolean[][] atlantic = new boolean[n][m];

        // pacific and atlantic DFS Tsunamia 
        for(int i = 0; i < n ; i++){
            dfs(heights , pacific , i , 0 , heights[i][0]);
            dfs(heights , atlantic , i , m - 1 , heights[i][m-1]);
        }

        for(int j = 0 ; j < m; j++){
            dfs(heights , pacific , 0, j , heights[0][j]);
            dfs(heights , atlantic , n-1 , j , heights[n-1][j]);
        }

        List<List<Integer>> res = new ArrayList<>();
        for(int row = 0; row < n; row++){
            for(int col = 0 ; col < m; col++){
                if(pacific[row][col] && atlantic[row][col]){
                    res.add(List.of(row,col));
                }
            }
        }
        return res;
    }
    private void dfs(int[][] heights,boolean[][] visited,int row , int col , int prevHeight){
        if(row < 0 || col < 0 || row >= n || col >= m || visited[row][col] || heights[row][col] < prevHeight){
            return ;
        }
        visited[row][col] = true;
        for(int i=0;i<4;i++){
            dfs(heights , visited , row+dx[i] , col+dy[i] , heights[row][col]);
        }
    }
}