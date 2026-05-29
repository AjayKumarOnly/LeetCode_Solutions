class Solution {
    public int minElement(int[] nums) {
        int min = Integer.MAX_VALUE;
        for(int  i : nums){
            int curr = 0;
            while(i > 0){
                curr += i % 10;
                i /= 10;
            }
            min = Math.min(min,curr);
        }
        return min;
    }
}