class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        long totalSum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                totalSum += grid[i][j];
            }
        }
        if (totalSum % 2 != 0) return false;
        long rowPrefix = 0;
        for (int i = 0; i < n; i++) {
            long rowSum = 0;
            for (int j = 0; j < m; j++) {
                rowSum += grid[i][j];
            }
            rowPrefix += rowSum;

            if (rowPrefix == totalSum / 2) return true;
        }
        long colPrefix = 0;
        for (int j = 0; j < m; j++) {
            long colSum = 0;
            for (int i = 0; i < n; i++) {
                colSum += grid[i][j];
            }

            colPrefix += colSum;

            if (colPrefix == totalSum / 2) return true;
        }

        return false;
    }
}