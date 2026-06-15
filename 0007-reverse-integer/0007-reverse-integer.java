class Solution {
    public int reverse(int x) {
        long res = 0;
        while(x != 0){
            int l = x % 10;
            x /= 10;
            res = res * 10 + l;
        }
        if(res < Integer.MIN_VALUE || res > Integer.MAX_VALUE) return 0;
        return (int)res;
    }
}