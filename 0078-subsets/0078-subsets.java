class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        backTracking(res,nums,0,temp);
        return res;
    }
    private void backTracking(List<List<Integer>> res,int[] nums,int pos ,List<Integer> temp){
        res.add(new ArrayList<>(temp));
        for(int i=pos;i<nums.length;i++){
            temp.add(nums[i]);
             backTracking(res,nums,i+1,temp);
            temp.remove(temp.size()-1);
        }
    }
}