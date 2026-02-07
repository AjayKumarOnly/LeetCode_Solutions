class Solution {
    public int minimumDeletions(String s) {
        int cnt = 0;
        int del= 0;
        for(char c : s.toCharArray()){
            if(c == 'b')cnt++;
            else{
                del = Math.min(del+1,cnt);
            }
        }
        return del;
    }
}