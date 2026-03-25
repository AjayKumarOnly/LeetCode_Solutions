class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        long[] rowSum = new long[n];
        long[] colSum = new long[m];
        long total = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                total += grid[i][j];
            }
        }
        long row = 0;
        for(int i =0; i<n;i++){ 
            for(int j=0;j<m;j++){
                row+=grid[i][j];
            }
            if(row * 2 == total) return true;
        }
         long col = 0;
        for(int i =0; i<m;i++){ 
            for(int j=0;j<n;j++){
                col+=grid[j][i];
            }
            if(col * 2 == total) return true;
        }
        return false;
    }
}