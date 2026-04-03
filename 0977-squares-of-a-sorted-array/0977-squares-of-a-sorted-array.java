class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] sqares = new int[n];
        for(int i = 0; i < n ; i++){
            sqares[i] = nums[i] * nums[i];
        }
        Arrays.sort(sqares);
        return sqares;
    }
}