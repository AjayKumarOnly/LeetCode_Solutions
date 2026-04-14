class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> res = new ArrayList<>();
        int start = binarySearch(nums,target);
        int end = binarySearch(nums,target+1);

        for (int i = start; i < end; i++) {
            res.add(i);
        }

        return res;

    }
    private static int binarySearch(int[] nums,int target){
        int left = 0, right = nums.length;
        while(left < right){
            int mid = (left+right)/2;
            if(nums[mid] < target){
                left = mid +1;
            }else right = mid;
        }
        return left;
    }
}