class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0 , maxFreq = 0 , maxLength = 0;
        Map<Character,Integer> mpp = new HashMap<>();

        for(int right = 0; right < s.length() ; right++){
            char c = s.charAt(right);
            mpp.put(c,mpp.getOrDefault(c,0)+1);
            maxFreq = Math.max(maxFreq , mpp.get(c));
            int charNeedToChange =(right-left+1) - maxFreq;

            if(charNeedToChange > k){
                char l = s.charAt(left);
                mpp.put(l,mpp.get(l)-1);
                left++;
            } 
            
            maxLength = Math.max(maxLength , right-left+1);
        }
        return maxLength;
    }
}