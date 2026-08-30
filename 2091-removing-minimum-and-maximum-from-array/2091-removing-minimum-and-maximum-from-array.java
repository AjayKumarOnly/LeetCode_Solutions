class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;

        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 1; i < n; i++) {
            if (nums[i] < nums[minIndex]) {
                minIndex = i;
            }
            if (nums[i] > nums[maxIndex]) {
                maxIndex = i;
            }
        }
        // Both from left
        int left = Math.max(minIndex, maxIndex) + 1;

        // Both from right
        int right = n - Math.min(minIndex, maxIndex);

        // One from left, one from right
        int leftRight = Math.min(minIndex, maxIndex) + 1 + n - Math.max(minIndex, maxIndex);

        return Math.min(left, Math.min(right, leftRight));
    }
}