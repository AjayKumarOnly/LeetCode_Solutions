class Solution {
    public int minSwaps(int[] nums) {
        
        Integer[] sorted = new Integer[nums.length];

        for (int i = 0; i < nums.length; i++) {
            sorted[i] = nums[i];
        }

        // Sort based on digit sum, then by number
        Arrays.sort(sorted, (a, b) -> {
            int sumA = sumOfDigit(a);
            int sumB = sumOfDigit(b);

            if (sumA != sumB) {
                return sumA - sumB;
            }

            return a - b;
        });

        // Map each number to its correct index
        HashMap<Integer, Integer> mpp = new HashMap<>();

        for (int i = 0; i < sorted.length; i++) {
            mpp.put(sorted[i], i);
        }

        int swaps = 0;
        boolean[] visited = new boolean[nums.length];

        // Find cycles
        for (int i = 0; i < nums.length; i++) {

            if (visited[i] || mpp.get(nums[i]) == i) {
                continue;
            }

            int cycleSize = 0;
            int j = i;

            while (!visited[j]) {
                visited[j] = true;

                // Move to the position where current element belongs
                j = mpp.get(nums[j]);

                cycleSize++;
            }

            // A cycle of size k requires k - 1 swaps
            swaps += cycleSize - 1;
        }

        return swaps;
    }

    private int sumOfDigit(int n) {
        int sum = 0;

        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }
}