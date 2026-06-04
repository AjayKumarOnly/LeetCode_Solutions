class Solution {
    public String minWindow(String s, String t) {
        if(s.length() < t.length()) return "";

        int[] tFreq = new int[128];
        int[] windowFreq = new int[128];

        for(char c : t.toCharArray()){
            tFreq[c]++;
        }
        int left = 0 , minLen = Integer.MAX_VALUE , start = 0;
        for(int right = 0; right < s.length(); right++){
            windowFreq[s.charAt(right)]++;

            while(containsAll(tFreq,windowFreq)){
                int currLen = right - left + 1;
                if(currLen < minLen){
                    minLen = currLen;
                    start = left;
                }
                windowFreq[s.charAt(left)]--;
                left++;
            }
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(start,start + minLen);
    }
    private boolean containsAll(int[] tFreq , int[] windowFreq){
        for(int i = 0; i < 128; i++){
            if(windowFreq[i] < tFreq[i]) return false;
        }
        return  true;
    }
}
// tc -> O(N + M)
//sp -> O(1) due to constant space