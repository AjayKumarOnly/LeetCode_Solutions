class Solution {
    public boolean isPerfectSquare(int num) {
        if(num < 2) return true;
        long guess = 0 , mid ;
        long left = 2 , right = num / 2 ;

        while(left <= right ){
             mid = left + (right - left ) / 2 ;
            guess = mid * mid;
            if(num == guess) return true;
            if(guess < num) left = mid +1 ;
            else right = mid - 1;
        }
        return false;
    }
}