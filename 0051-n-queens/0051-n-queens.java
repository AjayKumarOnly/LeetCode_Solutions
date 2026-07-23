class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        char[][] board = new char[n][n];

        for(int i = 0; i < n; i++){
            Arrays.fill(board[i],'.');
        }

        backTrack(0,res,board,n);
        return res;
    }
    private void backTrack(int col , List<List<String>> res , char[][] board,int n){
        if(col == n){
            res.add(construct(board));
            return ;
        }
        for(int row = 0; row < n ; row++){
            if(isValid(board,row,col,n)){
                board[row][col] = 'Q';
                backTrack(col+1,res,board,n);
                board[row][col] = '.';
            }
        }
    }
    private List<String> construct(char[][] board){
        List<String> temp = new ArrayList<>();
        for(char[] row : board){
            temp.add(new String(row));
        }
        return temp;
    }
    private boolean isValid(char[][] board , int row, int col , int n){
        for(int i = 0;  i < col;i++){
            if(board[row][i] == 'Q') return false;
        }
        for(int i = 1 ; row - i >= 0 && col - i >= 0; i++){
            if(board[row-i][col-i] == 'Q') return false;
        }
        for(int i = 1 ; row + i < n && col - i >= 0; i++){
            if(board[row+i][col-i] == 'Q') return false;
        }
        return true;
    }
}