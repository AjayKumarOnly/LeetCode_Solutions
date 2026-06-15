class Solution {
    public int minimizedStringLength(String s) {
        char[] freq = new char[26];
        for(int i = 0; i < s.length(); i++){
            freq[s.charAt(i) - 'a']++;
        }
        int cnt = 0;
        for(int i=0;i<26;i++){
            if(freq[i] != 0) cnt++;
        }
        return cnt;
    }
}