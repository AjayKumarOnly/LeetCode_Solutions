class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        int n = asteroids.length;
        long  mas = (long)mass;
        Arrays.sort(asteroids);
        for (int i = 0; i < n; i++) {

            if (mas >= asteroids[i])
                mas += asteroids[i];
            else if (mas < asteroids[i])
                mas -= asteroids[i];
        }
        if (mas <= 0)
            return false;
        return true;
    }
}