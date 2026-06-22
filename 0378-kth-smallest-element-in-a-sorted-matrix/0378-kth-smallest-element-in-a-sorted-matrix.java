class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        List<Integer> res = new ArrayList<>();
        for(int i = 0; i < matrix.length;i++){
            for(int j=0; j < matrix.length;j++){
                res.add(matrix[i][j]);
            }
        }
        Collections.sort(res);
        return res.get(k-1);
    }
}