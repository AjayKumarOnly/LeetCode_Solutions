class Solution {
    public String makeGood(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder res = new StringBuilder();

        for(char c : s.toCharArray()){
            if(!st.isEmpty() && Math.abs(st.peek() - c) == 32){
                st.pop();
            }else{
                st.add(c);
            }
        }
        for(char  c : st){
            res.append(c);
        }
        return res.toString();
    }
}