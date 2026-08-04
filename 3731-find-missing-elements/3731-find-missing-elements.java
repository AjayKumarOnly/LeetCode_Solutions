class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> res = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        int min = 101 , max = -1;

        for(int i : nums){
            min = Math.min(min,i);
            max = Math.max(max,i);
            set.add(i);
        }
        for(int i=min;i<=max;i++){
            if(!set.contains(i)){
                res.add(i);
            }
        }
        return res;
    }
}