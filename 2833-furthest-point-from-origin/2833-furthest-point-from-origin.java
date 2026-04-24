class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int pos=0,blank=0;
        for(char i : moves.toCharArray()){
            if(i == 'L'){
                pos++;
            }
            else if(i=='R'){
                pos--;
            }
            else {
               blank++;
            }
        }
        return Math.abs(pos) + blank;
    }
}