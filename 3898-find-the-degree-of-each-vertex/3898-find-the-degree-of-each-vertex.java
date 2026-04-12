class Solution {
    public int[] findDegrees(int[][] matrix) {
        int n = matrix.length;
        int[] res = new int[n];
        for(int i=0;i<n;i++){
            int degree=0;
            for(int j=0;j<n;j++){
                degree += matrix[i][j];
            }
            res[i] = degree;
        }
        return res;
    }
}