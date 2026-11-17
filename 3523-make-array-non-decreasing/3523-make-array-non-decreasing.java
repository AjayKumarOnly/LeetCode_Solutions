class Solution {
    public int maximumPossibleSize(int[] nums) {
        int size = 0 , prev = -1;

        for(int i : nums){
            if(i >= prev){
                prev = i;
                size++;
            }
        }
        return size;
    }
}