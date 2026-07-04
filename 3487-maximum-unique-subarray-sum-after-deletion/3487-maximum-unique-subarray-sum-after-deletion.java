class Solution {
    public int maxSum(int[] nums) {
        Set<Integer> set = new HashSet<>();

        int sum = 0;
        int max = Integer.MIN_VALUE;

        for (int num : nums) {
            max = Math.max(max, num);

            if (num > 0) {
                set.add(num);
            }
        }

        for (int num : set) {
            sum += num;
        }

        return sum == 0 ? max : sum;
    }
}