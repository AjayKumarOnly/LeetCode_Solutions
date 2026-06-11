class Solution {
    public int majorityElement(int[] nums) {
        int currentElement = nums[0];
        int cnt = 1;
        for(int i = 1; i < nums.length; i++){
            if(cnt == 0) currentElement = nums[i];

            if(nums[i] == currentElement){
                cnt++; 
            }else {
                cnt--;}
        }
        return currentElement;
    }
}