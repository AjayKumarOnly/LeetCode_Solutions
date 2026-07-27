class Solution {
    public int maxProduct(int[] nums) {
        int product = 1;
        int max1 =-1, max2 = -1;
        for(int i : nums){
            if(i > max1){
                max2 = max1;
                max1 = i;
            }
            else if (max2 < i){
                max2 = i;
            }
        }
        return (max1-1) * (max2 -1);
    }
}