class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> res = new ArrayList<>();

        for(int[] interval : intervals){
            // newInterval -> [1,2]   curr Interval -> [4,5]
            if(newInterval[1] < interval[0]){
                res.add(newInterval);
                newInterval = interval;
            }
            // curr Interval -> [3,4]  newInterval -> [5,7]
            else if(interval[1] < newInterval[0]){
                res.add(interval);
            }
            // this is overlapping condition 
            else {
                newInterval[0] = Math.min(newInterval[0],interval[0]);
                newInterval[1] = Math.max(newInterval[1],interval[1]);
            }
        }
        res.add(newInterval);
        return res.toArray(new int[res.size()][]);
    }
}
