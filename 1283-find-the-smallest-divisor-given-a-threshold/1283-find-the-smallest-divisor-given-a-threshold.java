class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int left = 1 , right = -1;

        for(int i : nums) right = Math.max(i,right);

        while(left <= right){
            int mid = left + (right - left) / 2;
            int div = findDiv(nums,mid);
            if(div <= threshold)  right = mid -1;
            else left = mid +1 ; 
        }
        return left;
    }
    private int findDiv(int[] nums , int val){
        int sum = 0;
        for(int i : nums){
            sum += Math.ceil((double)i/val);
        }
        return sum;
    }
}