class Solution {
    public int arrayPairSum(int[] nums) {
        int count = 0;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length -1; i+=2){
            int mini = Math.min(nums[i],nums[i+1]);
            count += mini;
        }
        return count;
    }
}