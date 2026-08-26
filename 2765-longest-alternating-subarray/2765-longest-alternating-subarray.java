class Solution {
    public int alternatingSubarray(int[] nums) {

        int maxLen = -1;
        int len = 1;
        int expected = 1;

        for (int i = 1; i < nums.length; i++) {

            int diff = nums[i] - nums[i - 1];

            if (diff == expected) {
                len++;
                expected *= -1;
            } else if (diff == 1) {
                len = 2;
                expected = -1;
            } else {
                len = 1;
                expected = 1;
            }

            if (len > 1) {
                maxLen = maxLen < len ? len : maxLen;
            }
        }
        
        return maxLen;
    }
}