class Solution {
    private static int sumDigit(int n){
        int ans = 0;
        while(n>0){
            int digit = n % 10;
            ans += digit;
            n /= 10;
        }
        return ans;
    }
    public int countEven(int num) {
        int cnt=0;
        for(int i=1;i<=num;i++){
            int n = sumDigit(i);
            if(n % 2 == 0){
                cnt++;
            }
        }
        return cnt;
    }
}