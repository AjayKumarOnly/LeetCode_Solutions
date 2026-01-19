class Solution {
public:
    int secondHighest(string s) {
        int large = -1;
        int small = -1;
        for(char i : s){
            if(isdigit(i)){
                int digit = i - '0';
                if(digit > large){
                    small = large;
                    large = digit;
                }
                else if(digit < large && digit > small){
                    small = digit;
                }
            }
        }
        return small;
    }
};