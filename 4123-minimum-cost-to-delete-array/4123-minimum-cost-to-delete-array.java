class Solution {
    public long minCost(int[] nums) {
        int n = nums.length;
        long ans = (long)nums[0] + nums[n-1];
        Arrays.sort(nums,1,n-1);
        for(int i = 1 ; i < n-2; i+=2){
            long curr = (long)nums[i]+nums[i+1];
            if(curr > 0) break;
            ans+=curr;
        }
        return ans;
    }
}