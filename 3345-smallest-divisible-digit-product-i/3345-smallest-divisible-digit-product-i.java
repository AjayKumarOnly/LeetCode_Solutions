class Solution {
    public int smallestNumber(int n, int t) {
        int num = n;

        for (int i = n; i <= 100; i++) {
            int product = 1;
            int copy = i;
            while (copy > 0) {
                product *= copy % 10;
                copy /= 10;
            }
            if (isDivisible(product,t)) {
                return num;
            }
            num++;
        }
        return -1;
    }

    private boolean isDivisible(int a, int t) {
        return (a % t == 0);
    }
}