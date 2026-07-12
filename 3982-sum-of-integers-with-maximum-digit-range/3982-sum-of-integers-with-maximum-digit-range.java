class Solution {
    public int maxDigitRange(int[] nums) {
        int sum = 0;
        Map<Integer, Integer> mpp = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            String num = String.valueOf(nums[i]);
            int max = -1, min = Integer.MAX_VALUE;

            for (char c : num.toCharArray()) {
                int digit = c - '0';
                max = Math.max(max, digit);
                min = Math.min(min, digit);
            }

            mpp.put(i, max - min); // key = index
        }

        int maxRange = -1;
        for (int val : mpp.values()) {
            maxRange = Math.max(maxRange, val);
        }

        for (Map.Entry<Integer, Integer> entry : mpp.entrySet()) {
            if (entry.getValue() == maxRange) {
                sum += nums[entry.getKey()];
            }
        }

        return sum;
    }
}