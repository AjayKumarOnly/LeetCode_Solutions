class Solution {
    public String processStr(String s) {
        StringBuilder result = new StringBuilder();
        for(char c : s.toCharArray()){
            
            if(Character.isLetter(c)) {
                result.append(c);
            }
            else if( c == '*'){
                if(result.isEmpty()){continue;}
                result.deleteCharAt(result.length()-1);
            } 
            else if (c == '%') result.reverse();
            else {
                result.append(result);
            }
        }
        return  result.toString();
    }
}