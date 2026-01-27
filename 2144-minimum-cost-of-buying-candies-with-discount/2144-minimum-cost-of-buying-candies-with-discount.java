class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int n = cost.length;
        int val = 0;
        for(int i= 0;i < n;i++){
            if(i % 3 != n % 3){
                 val += cost[i];
            }
        }
        return val;
    }
}