class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> st = new HashSet<>();
        for(int n : candyType){
            st.add(n);
        }
        if(st.size() > candyType.length/2){
            return candyType.length/2;
        }
        return st.size();
    }
}