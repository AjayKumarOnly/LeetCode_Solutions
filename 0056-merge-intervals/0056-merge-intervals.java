class Solution {
    public int[][] merge(int[][] intervals) {

        List<int[]> res = new ArrayList<>();

        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });

        int start = intervals[0][0];
        int end = intervals[0][1];


        for (int[] interval : intervals) {

            if (interval[0] <= end) {

                end = Math.max(end, interval[1]);

            } else {

                res.add(new int[]{start, end});

                start = interval[0];
                end = interval[1];
            }
        }

        res.add(new int[]{start,end});

        return res.toArray(new int[res.size()][]);
    }
}