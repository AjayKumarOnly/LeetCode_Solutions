class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()){
            if(Character.isLetter(c) || Character.isDigit(c)){
                sb.append(Character.toLowerCase(c));
            }
        }
        String str = sb.toString();
        int left = 0 , right = str.length() - 1;
        while(left <= right){
            if(str.charAt(left) != str.charAt(right)) return false;
            else {
                left++ ;
                right--;
            }
        }
        return true;
    }
}