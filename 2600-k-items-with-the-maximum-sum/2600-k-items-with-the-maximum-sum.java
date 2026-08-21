class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        int sum = 0;

        // Take 1s first
        int ones = Math.min(k, numOnes);
        sum += ones;
        k -= ones;

        // Take 0s
        int zeros = Math.min(k, numZeros);
        k -= zeros;

        // Take -1s
        if (k > 0) {
            sum -= k;
        }

        return sum;
    }
}