class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        for(int i = 0; i < n ; i++){
            nums[i] *= nums[i];
        }
        long ans = 0;
        Arrays.sort(nums);
        for(int i = 0; i < n / 2 ; i++){
            ans -= nums[i];
        }
        for(int i = n / 2; i < n ; i++){
            ans += nums[i];
        }
        return ans ;
    }
}
/*
    -3 -2 -1 1 2 3 
    112233
*/