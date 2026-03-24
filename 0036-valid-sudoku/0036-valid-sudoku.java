class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<String,Integer>mpp = new HashMap<>();
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if(board[i][j] != '.'){
                    String row = board[i][j] + "row" + i;
                    String col = board[i][j] + "col" + j;
                    String box = board[i][j] + "box" + (i/3) + "and" + (j/3);

                    mpp.put(row,mpp.getOrDefault(row,0)+1);
                    mpp.put(col,mpp.getOrDefault(col,0)+1);
                    mpp.put(box,mpp.getOrDefault(box,0)+1);

                    if(mpp.get(row) > 1 || mpp.get(col) > 1 || mpp.get(box) > 1)return false;
                }

            }
        }
        return true;
    }
}