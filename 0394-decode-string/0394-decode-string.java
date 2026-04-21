class Solution {
    public String decodeString(String s) {
        Stack<String> st = new Stack<>();
        for(char c : s.toCharArray()){
            if(c != ']'){
                st.push(String.valueOf(c));
            }
            else {
                StringBuilder temp = new StringBuilder();
                while(!st.peek().equals("[")){
                    temp.insert(0,st.pop());
                }
                st.pop(); // for removing '[' da

                StringBuilder num = new StringBuilder();
                // st.peek() gives a String beacase stack in str ds but Character.isDigit() looks for 'char' so i added .charAt(0) for str.
                while(!st.isEmpty() && Character.isDigit(st.peek().charAt(0))){ 
                    num.insert(0,st.pop());
                }
                String repeat = temp.toString().repeat(Integer.parseInt(num.toString()));
                st.push(repeat);
            }
        }
        StringBuilder result = new StringBuilder();
        for(String str : st){
            result.append(str);
        }
        return result.toString();
    }
}