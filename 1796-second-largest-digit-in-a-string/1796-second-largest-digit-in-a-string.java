class Solution {
    public int secondHighest(String s) {
        int large = -1;
        int second = -1;
        for(char c : s.toCharArray()){
            if(Character.isDigit(c)){
                int i = c -'0';
                if(large < i){
                second =  large;
                large = i;
            }else if(second < i && large > i) second = i;
            }
        }
   
        return second;
    }
}