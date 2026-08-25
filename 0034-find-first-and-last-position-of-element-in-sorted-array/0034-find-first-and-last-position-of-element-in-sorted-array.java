class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start = binarySearch(nums,target);
        if(start == nums.length || nums[start] != target) return new int[]{-1,-1};
        return new int[]{start,binarySearch(nums,target+1)-1};
        
    }
    private int  binarySearch(int[] nums , int target){
        int low = 0 , high = nums.length;
        while(low < high){
            int mid = low + (high - low) / 2 ;
            if(nums[mid] < target) low = mid +1 ;
            else {
                high = mid;
            }
        }
        return low;
    }
}