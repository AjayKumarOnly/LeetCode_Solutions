class Solution {
    public boolean detectCapitalUse(String s) {
        if(s.length() == 0|| s.length() == 1) return true;
        
            if(Character.isUpperCase(s.charAt(0))){
                boolean first = Character.isUpperCase(s.charAt(1));
                for(int i = 2; i < s.length();i++){
                    boolean curr = Character.isUpperCase(s.charAt(i));
                    if(first != curr)return false;
                }
            }
            else{
                for(int i = 0; i < s.length();i++){
                    if(Character.isUpperCase(s.charAt(i)))return false;
                }
            }
            return true;
    }
}