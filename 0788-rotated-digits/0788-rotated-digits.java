class Solution {
    private static boolean isValid(int x){
        boolean status = false;
        while(x > 0){
            int digit = x % 10;
            if(digit == 3 || digit == 4 || digit == 7) {
                return  false;
            }
            if(digit == 2 || digit == 5 || digit == 6 || digit == 9){
                status = true;
            }
            x/=10;
        }
        return status;
    }
    public int rotatedDigits(int n) {
        int count = 0;
        for(int i=1;i<=n;i++){
            if(isValid(i)){
                count++;
            }
        }
        return count;
    }
}