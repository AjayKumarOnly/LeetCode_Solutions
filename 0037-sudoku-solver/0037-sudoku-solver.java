class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }
    private boolean solve(char[][] board){
        for(int row=0;row<9;row++){
            for(int col=0;col<9;col++){
                if(board[row][col] == '.'){
                    for(char c ='1'; c <= '9'; c++){
                        if(isValid(board,row,col,c)){
                            board[row][col] = c;
                            if(solve(board)) return true;
                            board[row][col] = '.';
                        }
                    }
                   return false;
                }
            }
        }
        return true;
    }
    private boolean isValid(char[][]board,int row,int col,char c){
        for(int i=0;i<9;i++){
            if(board[row][i] == c || board[i][col] == c ) return false;
        }
        int boxRowStart = 3 * (row / 3);
        int boxRowEnd = 3 * (col / 3);
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(board[boxRowStart+i][boxRowEnd+j] == c) return false;
            }
        }
        return true;
    }
}
// 9^E

//E-> no of empty cell '.';

//O(2^n * n)