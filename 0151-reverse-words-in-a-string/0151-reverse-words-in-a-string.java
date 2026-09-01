class Solution {
    public String reverseWords(String s) {
        Stack<String> st = new Stack<>();
        String word = "";
        String res = "";
        for(char i : s.toCharArray()){
            if(i == ' '){
                if(!word.isEmpty()){
                    st.push(word);
                    word = "";
                }
            }
            else{
                    word += i;
                }
        }
        if(!word.isEmpty()) st.push(word);
        
        while(!st.isEmpty()){
            res += st.pop();
            if(!st.isEmpty()) res += " ";
        }
        return res;
    }
}