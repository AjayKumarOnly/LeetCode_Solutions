class Solution {
    public List<List<Integer>> permute(int[] nums) {
         List<List<Integer>> res = new ArrayList<>();
         List<Integer> temp = new ArrayList<>();
         backTracking(res,nums,new boolean[nums.length],temp);
         return res;
    }
    private void backTracking(List<List<Integer>> res,int[] nums,boolean[] used,List<Integer> temp){
        if(temp.size() == nums.length){
            res.add(new ArrayList<>(temp));
            return ;
        }
        for(int i = 0; i < nums.length; i++){
            if(used[i]) continue;
            used[i] = true;
            temp.add(nums[i]);
            backTracking(res,nums,used,temp);
            temp.remove(temp.size()-1);
            used[i] = false;
        }
    }
}