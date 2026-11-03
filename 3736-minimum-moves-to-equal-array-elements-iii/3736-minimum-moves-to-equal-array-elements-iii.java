class Solution {
    public int minMoves(int[] nums) {
        int max = -1 , moves = 0;
        for(int i : nums){
            max = Math.max(i,max);
        }
        for(int i : nums){
            moves += max - i;
        }
        return moves;
    }
}