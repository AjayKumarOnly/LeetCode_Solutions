class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int left=0 , right = 0;
        for(char i : moves.toCharArray()){
            if(i == 'L'){
                left++;
                right--;
            }
            else if(i=='R'){
                right++;
                left--;
            }
            else {
                left++;
                right++;
            }
        }
        return Math.max(left,right);
    }
}