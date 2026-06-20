class Solution {
    public boolean findSubarrays(int[] nums) {

        Map<Integer, Integer> freq = new HashMap<>();

        for(int i = 0; i < nums.length - 1; i++) {

            int sum = nums[i] + nums[i + 1];

            if(freq.containsKey(sum))
                return true;

            freq.put(sum, 1);
        }

        return false;
    }
}