class Solution {
public:
    bool isPalindrome(string s) {
        string filtered = "";
        for(char x:s){
            if(isalnum(x))
                filtered+=tolower(x);
        }
        int n = filtered.size();
            for(int i=0;i<n/2;i++){
                if(filtered[i]!=filtered[n-1-i]) return false;
            }
            return true;
    }
};