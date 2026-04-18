class Solution {
    public int mirrorDistance(int n) {
        int val = reverse(n);
        return Math.abs(val - n);
    }
    private static int reverse(int x){
        int res = 0;
        while(x!=0){
            //int dig = x % 10;
            res = res * 10 + (x % 10);
            x /= 10;
        }
        return res;
    }
}