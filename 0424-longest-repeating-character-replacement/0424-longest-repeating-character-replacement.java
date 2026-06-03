class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character,Integer> mpp = new HashMap<>();
        int left = 0 , maxFreq = 0 , maxWindow = 0;

        for(int right = 0; right < s.length(); right++){
            char ch = s.charAt(right);

            mpp.put(ch,mpp.getOrDefault(ch,0)+1);

            maxFreq = Math.max(maxFreq , mpp.get(ch));

            int windowLength = right - left + 1;

            int characterNeedsToBeChanged = windowLength - maxFreq;

            if(characterNeedsToBeChanged > k){
                char leftChar = s.charAt(left);
                mpp.put(leftChar,mpp.get(leftChar)-1);
                left++;
            }
            maxWindow = Math.max(maxWindow , right-left+1);
        }
        return maxWindow;
    }
}