class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left = 1 , right = Integer.MIN_VALUE;
        int sum = 0;
        for(int i : weights){
            right = Math.max(i,right);
            sum += i;
        }
        while(right <= sum){
            int mid = right + (sum - right) / 2;
            int d = check(weights,mid);
            if(d <= days) sum = mid -1 ;
            else  right = mid  +1 ;
        }
        return right;
    }
    private int check(int[] weight , int cap){
        int load = 0 , day = 1 ;
        for(int i : weight){
            if(load + i > cap){
                day++;
                load = i;
            }
            else load += i;
        }
        return day;
    }
}