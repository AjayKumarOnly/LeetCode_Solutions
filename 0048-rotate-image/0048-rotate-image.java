class Solution {
    private void swapDiagonal(int[][] matrix,int row, int col){
        int temp = matrix[row][col];
        matrix[row][col] = matrix[col][row];
        matrix[col][row] = temp;
    }
    private void reverse(int[] matrix, int i , int j){
        while(i < j){
            int temp = matrix[i];
            matrix[i] = matrix[j];
            matrix[j] = temp;
            i++;
            j--;
        }
          
    }
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for(int i = 0; i < n;i++){
            for(int j = 0; j < i; j++){
                swapDiagonal(matrix,i,j);
            }
        }
         
         for(int i = 0; i < n;i++){
            reverse(matrix[i],0,n-1);
        }
    }
}