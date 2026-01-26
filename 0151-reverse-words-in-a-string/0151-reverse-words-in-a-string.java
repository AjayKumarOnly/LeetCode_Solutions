class Solution {
    public String reverseWords(String s) {
        String[] ans = s.trim().split("\\s+");
        StringBuilder result = new StringBuilder();

        for(int i= ans.length -1; i >= 0; i--){
            result.append(ans[i]);
            if( i != 0) result.append(" ");
        }
        return result.toString();
    }
}