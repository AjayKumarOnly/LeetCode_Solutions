class Solution {
    public int largestInteger(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int i = 0; i <= nums.length - k; i++) {
            Set<Integer> set = new HashSet<>();
            for (int j = i; j < i + k; j++) {
                set.add(nums[j]);
            }
            for (int num : set) {
                freq.put(num, freq.getOrDefault(num, 0) + 1);
            }
        }
        int max = -1;
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            if (entry.getValue() == 1) {
                max = Math.max(max, entry.getKey());
            }
        }

        return max;
    }
}