class Solution {
    public int maxLength(int[] nums) {
        int n = nums.length;
        int max = 0;

        for (int i = 0; i < n; i++) {
            long prod = 1;
            int g = 0;
            int l = 1;
            for (int j = i; j < n; j++) {
                prod *= nums[j];
                g = gcd(g, nums[j]);
                l = lcm(l, nums[j]);
                if (prod == (long) l * g) {
                    max = Math.max(max, j - i + 1);
                }
                if (prod > 25200) break;
            }
        }
        return max;
    }

    private int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
    private int lcm(int a, int b) {
        return (a / gcd(a, b)) * b;
    }
}