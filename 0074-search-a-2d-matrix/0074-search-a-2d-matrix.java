class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        boolean res = false;
        for(int[] n : matrix){
            int l = 0 , r = n.length-1;
             res = binarySearch(n,l,r,target);
            if(res) return true;

        }
        return res;
    }
    private static boolean binarySearch(int[] arr, int left , int right,int target){
        while(left <= right){
            int mid = (left+right)/ 2;
            if(arr[mid] == target) return true;
            else if(arr[mid] < target) left = mid +1;
            else right = mid -1;
        }
        return false;
    }
}