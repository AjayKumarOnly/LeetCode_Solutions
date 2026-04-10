class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        int i = 0 , j = n-1 , pos = n-1;
        while(i <= j){
            if(Math.abs(nums[i]) < Math.abs(nums[j])){
                int sq = nums[j] * nums[j];
                ans[pos] = sq;
                pos--;
                j--;
            }else{
                int sq = nums[i] * nums[i];
                ans[pos] = sq;
                i++;
                pos--;
            }
        }
        return ans;
    }
}