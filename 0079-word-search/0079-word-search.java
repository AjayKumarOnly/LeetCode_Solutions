class Solution {
    public boolean exist(char[][] board, String word) {

        int n = board.length;
        int m = board[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == word.charAt(0) && dfs(i, j, 0, board, word)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(int row, int col, int start, char[][] board, String word) {

        int n = board.length;
        int m = board[0].length;

        if (start == word.length())
            return true;

        if (row < 0 || row >= n ||
                col < 0 || col >= m ||
                board[row][col] == '*' ||
                board[row][col] != word.charAt(start)) {

            return false;
        }
        char temp = board[row][col];
        board[row][col] = '*';

        if (dfs(row - 1, col, start + 1, board, word) ||
                dfs(row, col + 1, start + 1, board, word) ||
                dfs(row + 1, col, start + 1, board, word) ||
                dfs(row, col - 1, start + 1, board, word)) {
            return true;
        }
        board[row][col] = temp;
        return false;
    }
}