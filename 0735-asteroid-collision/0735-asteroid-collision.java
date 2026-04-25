class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        for(int i : asteroids){
        boolean destroy = false;
           while(!st.isEmpty() && st.peek() > 0 && i < 0){
            if(st.peek() < Math.abs(i)){
                st.pop();
            }
            else if(st.peek() == Math.abs(i)){
                st.pop();
                destroy = true;
                break;
            }
            else{
                destroy = true;
                break;
            }
           }

           if(!destroy) st.add(i);

        }
        int[] res = new int[st.size()];
        for(int i=res.length-1;i>=0;i--){
            res[i] = st.pop();
        }
        return res;
    }
}