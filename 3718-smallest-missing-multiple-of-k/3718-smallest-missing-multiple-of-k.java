class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums) set.add(i);
        int cpy = k ;
        boolean flag = true;
        while(flag){
            if(!set.contains(cpy)){
                flag = false;
                return cpy;
            }
            cpy = cpy + k;
        }
        return cpy;
    }
}