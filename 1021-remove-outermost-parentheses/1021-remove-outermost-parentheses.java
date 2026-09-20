class Solution {
    public String removeOuterParentheses(String s) {
        int len = s.length();
        if (len <= 2) return "";
        StringBuilder res = new StringBuilder();
        int cnt = 0;

        for(char c : s.toCharArray()){
            if(c == '('){
                if(cnt>0) res.append("(");
                cnt++;
            }
            else {
                cnt--;
                if(cnt>0) res.append(")");
            }
        }
        return res.toString();
    }
}