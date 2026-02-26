class Solution {
    public int numSteps(String s) {
        int stage = 0;
        int carry = 0;
        for(int i = s.length()-1; i > 0; i--){
            int decimal = Character.getNumericValue(s.charAt(i)) + carry;
            if(decimal == 1){
                stage += 2;
                carry = 1;
            }
            else{
                stage++;
            }
        }
        return stage+carry;
    }
}