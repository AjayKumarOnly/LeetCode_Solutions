class Solution {
    public int smallestUniqueSubarray(int[] nums) {
        int n = nums.length;
        int low = 1, high = n;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (isUnique(nums, mid)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
    private boolean isUnique(int[] nums, int k) {
        Map<Long, Integer> map = new HashMap<>();
        long base = 100003;
        long hash = 0;
        long power = 1;
        // Generate hash for the first window
        for (int i = 0; i < k; i++) {
            hash = hash * base + nums[i];

            if (i < k - 1)
                power *= base;
        }
        map.put(hash, 1);
        // Sliding window with rolling hash
        for (int i = k; i < nums.length; i++) {
            hash -= nums[i - k] * power;
            hash = hash * base + nums[i];

            map.put(hash, map.getOrDefault(hash, 0) + 1);
        }
        // Check whether any subarray appears once
        for (int freq : map.values()) {
            if (freq == 1)
                return true;
        }
     return false;
    }
}