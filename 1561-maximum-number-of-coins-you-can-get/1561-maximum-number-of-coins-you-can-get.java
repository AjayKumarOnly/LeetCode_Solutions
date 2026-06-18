class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int left = 0 , right = piles.length - 1 , sum = 0;
        while(left < right){
            right--;
            sum += piles[right--];
            left++;
        }
        return sum;
    }
}