class Solution {
    private int[] findPSE(int arr[],int n){
        Stack<Integer> st = new Stack<>();
        int[] res = new int[n];

        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]) st.pop();
            res[i] = st.isEmpty() ? -1 : st.peek();
            st.add(i);
        }
        return res;
    }
    private int[] findNSE(int arr[],int n){
        Stack<Integer> st = new Stack<>();
        int[] res = new int[n];

        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]) st.pop();
            res[i] = st.isEmpty() ? n : st.peek();
            st.add(i);
        }
        return res;
    }
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] pse = findPSE(heights,n);
        int[] nse = findNSE(heights,n);
        int maxArea = 0;

        for(int i=0;i<n;i++){
            int width = (nse[i] - pse[i]) -1;
            int area = heights[i] * width;
            maxArea = Math.max(area,maxArea);
        }
        return maxArea;
    }
}