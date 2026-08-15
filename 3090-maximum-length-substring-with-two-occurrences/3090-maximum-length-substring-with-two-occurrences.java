class Solution {
    public int maximumLengthSubstring(String s) {
        int left = 0 , maxLen = 0 , maxFreq = 0;
        Map<Character,Integer> mpp = new HashMap<>();

        for(int right = 0; right < s.length(); right++){

           int freq = mpp.getOrDefault(s.charAt(right), 0) + 1;
           mpp.put(s.charAt(right), freq);
            
            while(mpp.get(s.charAt(right)) > 2){
                mpp.put(s.charAt(left), mpp.get(s.charAt(left)) - 1);
                left++;
            }
            maxLen = Math.max(maxLen , right - left + 1);
        }
        return maxLen;
    }
}