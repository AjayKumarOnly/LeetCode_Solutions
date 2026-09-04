class Solution {
    public int percentageLetter(String s, char letter) {
        Map<Character,Integer> mpp = new HashMap<>();
        
        for(char c : s.toCharArray()){
            mpp.put(c,mpp.getOrDefault(c,0)+1);
        }

        if(mpp.containsKey(letter)){
            return  (mpp.get(letter) * 100) / s.length();
        }
        return 0;
    }
}