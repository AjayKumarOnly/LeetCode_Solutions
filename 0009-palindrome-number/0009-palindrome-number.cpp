class Solution {
public:
    bool isPalindrome(int x) {
        long rev = 0;
        int n = x;
        if(x < 0)return false;
        while(n!=0){
            int digit = n % 10;
            rev = rev * 10 + digit;
            n /= 10;
        }
        if(x == rev)return true;
        return false;
    }
};