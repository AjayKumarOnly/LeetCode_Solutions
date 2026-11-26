class Solution {
    public boolean canAliceWin(int n) {
        int stone = 10;
        int k = 0;
        while(n >= stone){
            n -= stone;
            stone--;
            k++;
        }
        return k % 2 == 1;
    }
}   