class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1 , right = 1;
        for(int p : piles){
            right = Math.max(right,p);
        }
        // taking the max of the piles arr ;

        while(left <= right){
            int mid = left + (right - left ) /2 ;
            int timeTaken = 0;

            for(int i : piles){
                timeTaken += Math.ceil((double)i/mid);
            }
            if(timeTaken <= h){
                right = mid - 1;
            }else {
                left = mid+1;
            }
        }
        return left;
    }
}