class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix.length , m = matrix[0].length;
        int left = 0 , right = m-1 , top = 0 , bottom = n-1;
        int dir = 0;
        List<Integer> list = new ArrayList<>();

        while(top <= bottom && left <= right) {
            switch(dir){
                case 0 ->{
                    for(int i = left ; i <= right;i++){
                        list.add(matrix[top][i]);
                    }
                    top++;
                }
                case 1 ->{
                    for(int i = top ; i <= bottom;i++){
                        list.add(matrix[i][right]);
                    }
                    right--;
                }
                case 2 ->{
                    for(int i = right ; i >= left;i--){
                        list.add(matrix[bottom][i]);
                    }
                    bottom--;
                }
                case 3 ->{
                    for(int i = bottom ; i >= top;i--){
                        list.add(matrix[i][left]);
                    }
                    left++;
                }
            }
            dir =( dir + 1)% 4 ;
            // to change the direction
        }
        return list;
    }
}
// TC -> 0(n * m);
// TC -> 0(n * m);