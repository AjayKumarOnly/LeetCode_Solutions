class Solution {
public:
    bool isPerfectSquare(int num) {
        if(num < 2) return true;
        long left = 2 , right = num / 2;
        long x , guessNum;
        while(left <= right){
            x = left + (right - left) / 2;
            guessNum = x * x;
            if(guessNum == num) return true;
            else if(guessNum < num)left = x +1;
            else{
                right = x - 1;
            }
        }
        return false;
    }
};