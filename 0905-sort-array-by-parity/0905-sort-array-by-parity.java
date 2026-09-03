class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] res = new int[nums.length];
        int ind = 0 , last = nums.length-1;

        for(int i : nums){
            if( i % 2 == 0){
                res[ind] = i;
                ind++;
            }else res[last--] = i;
        }
        // for(int i : nums){
        //     if( i % 2 != 0) res[ind++] = i;
        // }
        return res;
    }
}