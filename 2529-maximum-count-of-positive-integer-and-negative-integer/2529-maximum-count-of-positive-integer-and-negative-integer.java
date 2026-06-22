class Solution {
    public int maximumCount(int[] nums) {
        int maxPos = 0 , maxNeg = 0;
        for(int i : nums){
            if(i < 0) maxNeg++;
            else if(i > 0) maxPos++;
            else continue;
        }
        return Math.max(maxPos,maxNeg);
    }
}