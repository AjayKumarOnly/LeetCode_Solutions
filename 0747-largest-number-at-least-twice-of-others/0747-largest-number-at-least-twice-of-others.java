class Solution {
    public int dominantIndex(int[] nums) {
        int max = Integer.MIN_VALUE;
        int second = 0;
        int index = -1;
        for(int i = 0; i  < nums.length;i++){
            if(nums[i] > max){
                second = max;
                max = nums[i];
                index = i;
            }else if(nums[i] < max && nums[i] > second){
                second = nums[i];
            }
        }
        return max >= second*2 ?  index :  -1; 
    }
}