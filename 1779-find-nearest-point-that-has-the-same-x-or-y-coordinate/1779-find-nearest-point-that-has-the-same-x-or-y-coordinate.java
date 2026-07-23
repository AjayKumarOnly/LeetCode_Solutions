class Triple{
    int root , index;
    Triple(int root , int index){
        this.root = root;
        this.index = index;
    }
}
class TripleCompare implements Comparator<Triple>{
    public int compare(Triple a ,Triple b){
        if(a.root < b.root) return -1;
        else if(a.root > b.root) return 1;
        return 0;
    }
}
class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        Queue<Triple> res = new PriorityQueue<>(new TripleCompare());
        for(int i = 0; i < points.length ; i++){
            int[] point = points[i];
            if(point[0] == x || point[1] == y){
                int dis = Math.abs(x-point[0]) + Math.abs(y-point[1]);
                res.add(new Triple(dis,i));
            }
        }
        if(res.isEmpty()) return -1;
        return res.peek().index;
    }
}