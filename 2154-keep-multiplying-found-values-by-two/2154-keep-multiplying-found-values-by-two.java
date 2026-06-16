class Solution {
    public int findFinalValue(int[] nums, int original) {
        int res = original;
        Set<Integer> mpp = new HashSet<>();

        for(int i : nums){
            mpp.add(i);
        }
        while(true){
            if(mpp.contains(res)) res *= 2;
            else break;
        }
        return res;
    }
}