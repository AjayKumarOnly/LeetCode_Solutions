class Solution {
    public int minOperations(int[][] grid, int x) {
        List<Integer> temp = new ArrayList<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                temp.add(grid[i][j]);
            }
        }
         Collections.sort(temp);
        int low = 0 , high = temp.size()-1;
        int mid = (low + high) / 2;
        int key = temp.get(mid);

        int oper = 0;

        for(int num : temp){
            if(Math.abs(num - key) % x != 0) return -1;
           oper += Math.abs(num-key) / x;
        }
        return oper;
    } 
}