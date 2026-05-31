class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        int n = asteroids.length;
        long mas = (long) mass;
        Arrays.sort(asteroids);
        for (int i = 0; i < n; i++) {

            if (mas < asteroids[i])
                return false;
            mas += asteroids[i];
        }
        return true;
    }
}