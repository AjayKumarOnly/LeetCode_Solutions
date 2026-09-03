class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] res = new int[nums.length];
        int ind = 0;

        for(int i : nums){
            if( i % 2 == 0){
                res[ind] = i;
                ind++;
            }
        }
        for(int i : nums){
            if( i % 2 != 0) res[ind++] = i;
        }
        return res;
    }
}