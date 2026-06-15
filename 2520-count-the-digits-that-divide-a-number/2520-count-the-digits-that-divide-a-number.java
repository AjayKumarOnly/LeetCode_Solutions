class Solution {
    public int countDigits(int num) {
        int cnt = 0;
        int copy = num;
        while(copy > 0){
            int last = copy % 10;
            if(num % last == 0) cnt++;
            copy /= 10;
        }
        return cnt;
    }
}