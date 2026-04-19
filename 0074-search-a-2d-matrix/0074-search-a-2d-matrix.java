class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m=matrix[0].length;
        int low = 0 , high = m*n;
        while(low < high){
            int mid = low + (high - low)/2;
            int curr = matrix[mid/m][mid%m];
            if(curr == target) return true;
            if(target < curr) high = mid;
            else low = mid +1 ;
        }
        return false;
    }
}