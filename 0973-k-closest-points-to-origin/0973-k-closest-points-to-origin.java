class Triplet{
    double root ;
    int x , y;
    Triplet(double root , int x ,int y){
        this.root = root;
        this.x = x;
        this.y = y;
    }
}
class TripletComparator implements Comparator<Triplet>{
    public int compare(Triplet x , Triplet y){
        if(x.root > y.root) return 1;
        else if(x.root < y.root) return -1;
        else return 0;
    }
}

class Solution {
    public int[][] kClosest(int[][] points, int k) {
        Queue<Triplet> queue = new PriorityQueue<>(new TripletComparator());
        for(int i[] : points){
              double distance = Math.sqrt((i[0] * i[0]) + (i[1] * i[1]));
              queue.add(new Triplet(distance,i[0],i[1]));
        }
        int[][] res = new int[k][2];
        int ind = 0;
        while(k > 0){
            res[ind][0] = queue.peek().x;
            res[ind][1] = queue.peek().y;
            ind++;
            queue.remove();
            k--;
        }
        return res;
    }
}