class Solution {
    public int countElements(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        int n = nums.length;
        int low = nums[0];
        int high = nums[n-1];
        for(int i = 0; i < n ; i++){
            if(nums[i] != low && nums[i] != high){
                count++;
            }
        }
        return count;
    }
}