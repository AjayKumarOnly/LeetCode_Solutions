class Solution {
    public int gcdOfOddEvenSums(int n) {
        int oddSum = 0 , evenSum = 0;
        for(int i = 1; i <= n*2; i++){
            if(i % 2 == 0) evenSum += i;
            if(i%2 == 1) oddSum += i;
        }
        return gcd(oddSum,evenSum);
    }
    private int gcd(int a, int b){
        if(b==0)return a;
        return gcd(b,a%b);
    }
}