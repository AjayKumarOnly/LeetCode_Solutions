class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;

        int[][] dist = new int[n][m];
        Queue<int[]> q = new LinkedList<>();

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(mat[i][j] == 0){
                    q.offer(new int[]{i,j});
                }else {
                    dist[i][j] = Integer.MAX_VALUE;
                }
            }
        }

        int[] dx = {-1,0,1,0};
        int[] dy = {0,1,0,-1};

        while(!q.isEmpty()){
            int[] curr = q.poll();
            int row = curr[0];
            int col = curr[1];

            for(int d = 0; d < 4; d++){
                int newRow = row + dx[d];
                int newCol = col + dy[d];

                if(newRow >= 0 && newRow < n && newCol >= 0 && newCol < m){
                    int newDist = dist[row][col] + 1;

                    if(newDist < dist[newRow][newCol]){
                        dist[newRow][newCol] = newDist;
                        q.offer(new int[]{newRow,newCol});
                    }
                }
            }
        }

        return dist;
    }
}
// tc -> no of zero *  O(n * m);
// sc -> no of zero