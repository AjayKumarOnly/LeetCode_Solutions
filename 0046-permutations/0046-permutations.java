class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        backTrack(res,temp,nums,visited);
        return res;
    }
    private void backTrack(List<List<Integer>>res,List<Integer>temp,int[] nums,boolean[] visited){
        if(temp.size() == nums.length){
            res.add(new ArrayList<>(temp));
            return ;
        }
        for(int i = 0; i < nums.length;i++){
            if(visited[i]) continue;
            temp.add(nums[i]);
            visited[i] = true;
            backTrack(res,temp,nums,visited);
            visited[i] = false;
            temp.remove(temp.size()-1);
        }
    }
}