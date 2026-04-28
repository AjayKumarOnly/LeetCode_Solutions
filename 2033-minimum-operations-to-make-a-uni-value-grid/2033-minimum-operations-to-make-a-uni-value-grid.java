class Solution {
    public int minOperations(int[][] grid, int x) {
        List<Integer> temp = new ArrayList<>();
        int n = grid.length;
        int m = grid[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                temp.add(grid[i][j]);
            }
        }
        Collections.sort(temp);
        int low = 0 , high = temp.size() - 1;
        int mid = (low + high) / 2 , target = temp.get(mid);

       int operations = 0;
        for (int num : temp) {
            if (Math.abs(num - target) % x != 0) {
                return -1;
            }
            operations += Math.abs(num - target) / x;
        }
        return operations;
    }
}