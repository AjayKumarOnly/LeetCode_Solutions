class Solution {
    public int largestAltitude(int[] gain) {
        int index = 0 , sum  = 0;
        int max = 0;
        for(int i = 0; i < gain.length; i++){
             sum += gain[i];
            if(sum > max ) {
                index = i;
                max = sum;
            }
        }
        return max;
    }
}