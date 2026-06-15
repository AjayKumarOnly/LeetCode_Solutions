class Solution {
    public String removeStars(String s) {
        String ans = "";
        if(s == "") return "";
        Stack<Character> st = new Stack<>();
        for(char c : s.toCharArray()){
            if(c != '*') st.push(c);
            else {
                st.pop();
            }
        }
        for(char c : st){
            ans += c;
        }
        return ans;
    }
}