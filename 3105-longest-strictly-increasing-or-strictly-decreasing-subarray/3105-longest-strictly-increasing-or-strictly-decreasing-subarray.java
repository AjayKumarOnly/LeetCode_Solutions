class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int maxAsc = -1 , maxDec = -1;
        int asc = 1 , des = 1;

        for(int i = 0; i < nums.length -1; i++){
            if(nums[i] < nums[i+1]) asc++;
            else  {
                maxAsc = Math.max(maxAsc,asc);
                    asc = 1;
                }
        }
          maxAsc = Math.max(maxAsc,asc);

        for(int i = 0; i < nums.length -1; i++){
            
            if(nums[i] > nums[i+1]) des++;
            else {
                maxDec = Math.max(maxDec,des);
                des = 1;
            }
        }
        maxDec = Math.max(maxDec,des);
        return Math.max(maxAsc,maxDec);
    }
}