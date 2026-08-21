class Solution {
    public int maxOperations(int[] nums, int k) {
        Map<Integer,Integer> mpp = new HashMap<>();
        int cnt = 0;
        for(int i : nums){
            int com = k - i;
            if(mpp.getOrDefault(com, 0) > 0){
                mpp.put(com,mpp.get(com)-1);
                cnt++;
            }
            else{
                mpp.put(i,mpp.getOrDefault(i,0)+1);
            }
        }
        return cnt;
    }
}