class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] freq = new int[128];
        for(char i : magazine.toCharArray()){
            freq[i-'0']++;
        }
        for(char i : ransomNote.toCharArray()){
            freq[i-'0']--;
        }
        for(int i : freq){
            if(i < 0)return false;
        }
        return true;
    }
}