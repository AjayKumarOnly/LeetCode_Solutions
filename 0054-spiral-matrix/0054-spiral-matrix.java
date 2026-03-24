import java.util.*;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        int n = matrix.length, m = matrix[0].length;
        int left = 0, top = 0, bottom = n - 1, right = m - 1;
        int dir = 0;

        while (left <= right && top <= bottom) {

            switch (dir) {

                case 0 -> { 
                    // left -> right
                    for (int i = left; i <= right; i++) {
                        result.add(matrix[top][i]);
                    }
                    top++;
                }

                case 1 -> { 
                    // top -> bottom
                    for (int i = top; i <= bottom; i++) {
                        result.add(matrix[i][right]);
                    }
                    right--;
                }

                case 2 -> {
                     // right -> left
                    for (int i = right; i >= left; i--) {
                        result.add(matrix[bottom][i]);
                    }
                    bottom--;
                }

                case 3 -> { 
                    // bottom -> top
                    for (int i = bottom; i >= top; i--) {
                        result.add(matrix[i][left]);
                    }
                    left++;
                }
            }

            dir = (dir + 1) % 4;
        }
        return result;
    }
}