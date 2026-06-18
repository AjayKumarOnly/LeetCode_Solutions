class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> res = new ArrayList<>();

        for(int i = 0; i < n-1; i++){
            if(i==0 || i > 0 && nums[i]!=nums[i-1]){
            int low = i+1 , right = n-1 , target = -nums[i];

            while(low < right){
                int currSum = nums[low] + nums[right];

                if(currSum == target){
                    res.add(Arrays.asList(nums[i],nums[low],nums[right]));

                    while(low < right && nums[low] == nums[low+1]) {
                        low++;
                    }
                    while(low < right && nums[right] == nums[right-1]) {
                      right--;
                    }
                    low++;
                    right--;
                }
                else if (currSum > target) right--;
                else low++;
            }
            }
        }
        return res;
    }
}