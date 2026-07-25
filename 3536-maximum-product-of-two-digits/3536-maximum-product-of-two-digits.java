class Solution {
    public int maxProduct(int n) {
        int firstMax = 0 , secondMax = 0;
        
        while(n > 0){
            int dig = n % 10;
            if(dig >= firstMax){
                secondMax = firstMax;
                firstMax = dig;
            }else if(dig > secondMax ){
                secondMax = dig;
            }
            n /= 10;
        }
        return firstMax * secondMax;
    }
}