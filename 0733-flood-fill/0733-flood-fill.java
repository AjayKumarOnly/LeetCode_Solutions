class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc] == color) return image;
        dfs(sr,sc,image,color,image[sr][sc]);
        return image;

    }
    private  void dfs(int row , int col , int[][] image , int color , int initColor){
        int n = image.length;
        int m = image[0].length;
       
        if(row >= 0  && row < n && col >= 0 && col < m && image[row][col] == initColor){
            image[row][col] = color;
            dfs(row+1,col,image,color,initColor); //down
          dfs(row,col+1,image,color,initColor); // right
            dfs(row-1,col,image,color,initColor); //up
            dfs(row,col-1,image,color,initColor); //left
        }
    }
}
// tc -> O(N);
// sc = > O(1);