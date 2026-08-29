class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,new Comparator<int[]>(){
            public int compare(int[] a, int[] b){
                return a[1] - b[1]; // ascending order
            }
        });
        // After Sorting : [[1,2],[2,3],[1,3],[3,4]]
        int remove = 0;
        int end = Integer.MIN_VALUE;
        for(int[] interval : intervals){
            if(interval[0] >= end){
                end = interval[1];
            }else{
                remove++;
            }
        }
        return remove;
    }
}