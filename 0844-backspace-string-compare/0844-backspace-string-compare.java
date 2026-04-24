class Solution {
    private static String Compare(String s){
        Stack<Character> st = new Stack<>();

        for(char c : s.toCharArray()){
            if(c != '#') st.push(c);
            else if(!st.isEmpty())st.pop();
        }
        return String.valueOf(st);
    } 
    public boolean backspaceCompare(String s, String t) {
        return Compare(s).equals(Compare(t));
    }
}