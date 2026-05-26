class Solution {
    public int numberOfSpecialChars(String word) {
        int cnt = 0;
        HashSet<Character> mpp = new HashSet<>();

        for(char s : word.toCharArray()){
                 mpp.add(s);
        }
        for(char ch='a';ch<='z';ch++){
            if(mpp.contains(ch) && mpp.contains(Character.toUpperCase(ch))){
                cnt++;
            }
        }
        return cnt;
    }
}