class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0  , maxFreq = 0 , maxWindowLength = 0;
        Map<Character,Integer> mpp = new HashMap<>();
        for(int right = 0; right < s.length(); right++){
            char ch = s.charAt(right);
            mpp.put(ch,mpp.getOrDefault(ch,0)+1);

            maxFreq = Math.max(mpp.get(ch),maxFreq);
            
            int charNeedToChange = (right-left+1) - maxFreq;
            if(charNeedToChange > k){
                char l = s.charAt(left);
                mpp.put(l,mpp.get(l)-1);
                left++;
            }
            maxWindowLength = Math.max(maxWindowLength,(right-left+1));
        }
        return maxWindowLength;
    }
}