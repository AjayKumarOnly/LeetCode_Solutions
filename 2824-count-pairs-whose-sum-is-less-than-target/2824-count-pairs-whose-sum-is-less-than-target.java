class Solution {
    public int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums);
        int left = 0 , right = nums.size() -1 ;
        int cnt = 0;

        while(left < right){
            int sum = nums.get(left) + nums.get(right) ;
            if(sum < target) {
                cnt += right - left ;
                left++;
            }else {
                right--;
            }
        }
        return cnt;
    }
}