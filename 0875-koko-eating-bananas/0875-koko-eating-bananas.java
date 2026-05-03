class Solution {
    public static int timeTaken(int[] arr, int mid){
        int time = 0;
        for(int i=0; i< arr.length; i++){
            time += Math.ceil((double)arr[i]/mid);
        }
        return time;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        if(n > h) return -1;
        int low = 1 , high = -1;
        for(int i=0;i<n;i++){
            high = Math.max(high,piles[i]);
        }
        int ans = high;
        while(low <= high){
            int mid = (low + high) / 2;
            int time = timeTaken(piles,mid);
            if(time <= h){
                ans = mid;
                high = mid -1;
            }
            else {
                low = mid +1 ;
            }

        }
        return ans;
    }
     
}