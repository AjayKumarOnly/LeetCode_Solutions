class Solution {
    public int removeElement(int[] nums, int val) {
        int x = 0;
        for(int i=0;i<nums.length;i++){
            if(val != nums[i]){
                nums[x++] = nums[i];
            }
        }
        return x;
    }
}