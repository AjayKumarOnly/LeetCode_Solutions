class Solution {
    public int longestBalanced(String s) {
        int n = s.length();
        int ans = 0;
        for(int i = 0; i < n; i++){
            int[] freq = new int[26];
            int maxFreq = 0;
            for(int j = i; j < n; j++){
                int index = s.charAt(j) -'a';
                freq[index]++;
                maxFreq = Math.max(maxFreq,freq[index]);
                int unique = 0;
                for(int k = 0; k < 26; k++){
                    if(freq[k] > 0) unique++;
                }
                int len = j-i+1;
                if(len == maxFreq * unique){
                    ans = Math.max(ans,len);
                }
            }
        } 
        return ans;
    }
}