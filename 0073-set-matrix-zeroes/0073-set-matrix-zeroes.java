class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        Set<Integer>row = new HashSet<>();
        Set<Integer>col = new HashSet<>();
        for(int i =0;i<n;i++){
            for(int j = 0; j< m; j++){
                if(matrix[i][j] == 0){
                    row.add(i);
                    col.add(j);
                }
            }
        }
         for(int r : row){
            for(int i=0; i< m; i++){
                matrix[r][i] = 0;
            }
         }
          for(int c : col){
            for(int i=0; i< n; i++){
                matrix[i][c] = 0;
            }
         }
        
    }
}