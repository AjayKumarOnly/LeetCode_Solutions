class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if((mat.length*mat[0].length)!=r*c) return mat;
        else{
        int[][] re=new int[r][c];
        int k=0,l=0;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                re[i][j]=mat[k][l];
                if(l<mat[0].length-1){l++;}
                else{
                    l=0;
                    k++;
                }
            }
        }
        return re;
        }
    }
}