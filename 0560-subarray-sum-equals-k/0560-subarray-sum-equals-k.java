class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        if(n == 0) return 0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1); //It handles the case where a subarray starting from index 0 itself has sum k.
     
        int prefixSum = 0 , count = 0;
        for(int i = 0; i < n ; i++){
            prefixSum += nums[i];
            if(map.containsKey(prefixSum - k)){
                count += map.get(prefixSum - k);
            }
            map.put(prefixSum , map.getOrDefault(prefixSum , 0) +1);
        }
        return count;
    }
}