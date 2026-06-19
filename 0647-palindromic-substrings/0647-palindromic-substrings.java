class Solution {
    public int countSubstrings(String s) {
        int cnt = 0 , n = s.length();
        for(int i = 0; i < n; i++){
            cnt += expand(s,i,i);
            cnt += expand(s,i,i+1);
        }
        return cnt;
    }
    private int expand(String s, int left , int right){
        int cnt = 0;
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
            cnt++;
        }
        return cnt;
    }
}