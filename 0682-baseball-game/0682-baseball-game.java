class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();

        for(String c : operations){
            if(c.equals("+")){
                int a = st.pop();
                int b = st.pop();
                st.push(b);
                st.push(a);
                st.push(a+b);
            }
            else if(c.equals("C")){
                st.pop();
            }
            else if(c.equals("D")){
                int a = st.peek();
                st.push(2*a);
            }
            else {
                st.push(Integer.parseInt(c));
            }
        }
        int sum = 0;
        for(int i : st){
            sum += i;
        }
        return sum;
    }
}