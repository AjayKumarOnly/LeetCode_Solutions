class Solution {
    public int maxRotateFunction(int[] nums) {
        int n = nums.length;
        int total = 0, f0=0, max=0 , prev=0 ;
        for(int i=0;i<n;i++){
            total += nums[i];
            f0 += (i * nums[i]);
        }
        max = f0;
        prev = f0;

        for(int k=1;k<n;k++){
            int curr = prev + total - (n * nums[n-k]);
            max = Math.max(curr,max);
            prev = curr;
        }
        return max;
    }
}