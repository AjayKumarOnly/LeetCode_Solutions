class Solution {

    public int maximumTastiness(int[] prices, int k) {

        Arrays.sort(prices);

        int low = 0;
        int high = prices[prices.length - 1] - prices[0];

        int ans = 0;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (canPick(prices, k, mid)) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }

    private boolean canPick(int[] prices, int k, int minDiff) {

        int count = 1;
        int last = prices[0];

        for (int i = 1; i < prices.length; i++) {

            if (prices[i] - last >= minDiff) {
                count++;
                last = prices[i];
            }

            if (count == k) {
                return true;
            }
        }

        return false;
    }
}