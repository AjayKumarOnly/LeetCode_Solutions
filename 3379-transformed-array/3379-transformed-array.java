class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int result[] = new int[nums.length];
        int n = nums.length;
        for(int i = 0; i < n; i++){
            if(nums[i] == 0){
                result[i] = 0;
            }else{
                int index = Math.floorMod(i + nums[i], n);
                result[i] = nums[index];
            }
        }
        return result;
    }
}