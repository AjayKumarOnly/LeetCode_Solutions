class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> st = new HashSet<>();
        Set<Integer> result = new HashSet<>();
        for(int i : nums1){
            st.add(i);
        }
        for(int i : nums2){
            if(st.contains(i)){
                result.add(i);
            }
        }
        int[] ans = new int[result.size()];
        int i = 0;
        for(int element : result){
            ans[i++] = element;
        }
        return ans;
    }
}