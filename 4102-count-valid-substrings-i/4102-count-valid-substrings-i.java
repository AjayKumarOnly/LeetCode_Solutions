class Solution {
    public long countValidSubstrings(String s) {
        int n = s.length() ;
        int last = -1; // to trace 'a';
        long ans = 0;
        
        for(int i = 0 ; i < n; i++){
            if(i >= 2 && s.charAt(i) == 'c' && s.charAt(i-1) == 'b' && s.charAt(i-2) == 'a'){
                last = i - 2; // marking index i-2  'a' 
            }
            ans += i - last; // tracks the single + double digits until seeing 'c';
        }
        return ans;
    }
}