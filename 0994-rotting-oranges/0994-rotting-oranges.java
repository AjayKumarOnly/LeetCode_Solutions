class Solution {
    public int orangesRotting(int[][] grid) {
        int n = grid.length , m = grid[0].length;
        int time = 0 , fresh = 0;
        Queue<int[]> q = new LinkedList<>(); 

        
        for(int i = 0; i < n ; i++){
            for(int j = 0 ; j  < m ; j++){

                // adding rotten orange in queue with row , col , time
                if(grid[i][j] == 2){
                    q.offer(new int[]{i,j,0});
                }
                else if(grid[i][j] == 1) fresh++;
            }
        }

        while(!q.isEmpty()){
            int[] curr = q.poll();
            int row = curr[0] , col = curr[1] , t = curr[2];
        
            time = Math.max(time,t);

            int[] dx = {-1,0,1,0};
            int[] dy = {0,1,0,-1};

            for(int i = 0; i < 4; i++){
                int newRow = row + dx[i] , newCol = col + dy[i];
                if(newRow >= 0 && newRow < n && newCol >= 0 && newCol < m && grid[newRow][newCol] == 1){
                     grid[newRow][newCol] = 2;
                     fresh--;
                     q.offer(new int[]{newRow,newCol,t+1});
                }
            }
        }
        return (fresh == 0) ? time : -1;
    }
}