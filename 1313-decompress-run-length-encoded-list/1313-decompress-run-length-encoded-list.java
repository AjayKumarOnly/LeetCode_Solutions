class Solution {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for(int i = 0; i < nums.length; i+=2){
            int freq = nums[i];
            int element = nums[i+1];
            for(int j = 0; j < freq;j++){
                res.add(element);
            }
        }
        int[] ans = new int[res.size()];
        int ind = 0;
        for(int i : res){
            ans[ind++] = i;
        }
        return ans;
    }
}