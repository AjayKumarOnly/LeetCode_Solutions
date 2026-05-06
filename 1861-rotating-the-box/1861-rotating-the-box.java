class Solution {
    public char[][] rotateTheBox(char[][] boxGrid) {
        int row = boxGrid.length;
        int col = boxGrid[0].length;
        char[][] result = new char[col][row];

        for(int i=0;i<col;i++){
            for(int j=0;j<row;j++){
                result[i][j] = boxGrid[j][i];
            }
        }
        for(int i=0;i<col;i++){
            for(int j=0;j<row/2;j++){
                char temp = result[i][j];
                result[i][j] = result[i][row-1-j];
                result[i][row-1-j] = temp;
            }
        }
        for(int j=0;j<row;j++){
            int lowRow = col-1;
            for(int i=col-1;i>= 0;i--){
                if(result[i][j] == '#'){
                    result[i][j] = '.';
                    result[lowRow][j] = '#';
                    lowRow--;
                }
                if(result[i][j] == '*'){
                    lowRow = i-1;
                }
            }
        }
        return result;
    }
}