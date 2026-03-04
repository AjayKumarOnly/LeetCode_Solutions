class Solution {
    public int numSpecial(int[][] mat) {
        int row = mat.length;
        int col = mat[0].length;
        int cnt = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                if (mat[i][j] == 1) {
                    boolean special = true;
                    for (int c = 0; c < col; c++) {
                        if (c != j && mat[i][c] == 1) {
                            special = false;
                            break;
                        }
                    }
                    for (int r = 0; r < row; r++) {
                        if (r != i && mat[r][j] == 1) {
                            special = false;
                            break;
                        }
                    }

                    if (special)
                        cnt++;
                }
            }
        }
        return cnt;
    }
}