class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char first = letters[0];
        for(char i : letters){
            if(i > target){
                return i;
            }
        }
        return first;
    }
}