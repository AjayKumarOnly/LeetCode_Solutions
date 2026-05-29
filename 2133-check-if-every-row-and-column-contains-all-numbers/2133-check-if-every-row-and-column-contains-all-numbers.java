class Solution {
    public boolean checkValid(int[][] matrix) {
        Map<String,Integer> mpp = new HashMap<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                String row = matrix[i][j]+"row"+i;
                String col =  matrix[i][j]+"col"+j;

                mpp.put(row,mpp.getOrDefault(row,0)+1);
                mpp.put(col,mpp.getOrDefault(col,0)+1);

                if(mpp.get(col) > 1 || mpp.get(row) > 1){
                    return false;
                }
            }
        }
        return true;
    }
}