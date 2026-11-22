class Solution {
    public boolean checkString(String s) {
        char curr = 'a';
        int cnt = 0;

        for(char c : s.toCharArray()){
            if(curr == c){
                continue;
            }
            else if(curr != c && cnt == 0){
                cnt++;
                curr = c;
            }
            else {
                return false;
            }
        }
        return true;
    }
}