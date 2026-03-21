class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer> mpp = new HashMap<>();
        for(char i : magazine.toCharArray()){
            mpp.put(i,mpp.getOrDefault(i,0)+1);
        }
        for(char c : ransomNote.toCharArray()){
            if(!mpp.containsKey(c) || mpp.get(c) <= 0)return false;
            mpp.put(c,mpp.get(c)-1);
        }
        return true;
    }
}