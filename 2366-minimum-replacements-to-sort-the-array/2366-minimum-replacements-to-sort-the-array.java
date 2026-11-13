class Solution {
    public long minimumReplacement(int[] nums) {
        long operation = 0;
        long limit = Long.MAX_VALUE; // to track smallest limit 

        for(int i = nums.length -1 ; i >= 0 ; i--){
            int curr = nums[i];
            if(curr <= limit){
                limit = curr;
            }
            else {
                long parts = (curr - 1 )/ limit + 1; // give the number of proper possible splitable number... 
                operation += parts - 1;
                limit = curr / parts; // give the smallest divided num 
            }
        }
        return operation;
    }
}