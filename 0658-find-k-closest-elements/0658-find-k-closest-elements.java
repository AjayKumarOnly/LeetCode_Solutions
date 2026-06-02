class ClosestComparator implements Comparator<Integer>{
    int x = 0;
    public ClosestComparator(int x){
        this.x = x;
    }
    public int compare(Integer a , Integer b){
        int diff = Math.abs(b-x) - Math.abs(a-x);
        if(diff == 0){
            return b - a;
        }
        return diff;
    }
}

class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(new ClosestComparator(x));
        for(int i : arr){
            pq.offer(i);
            if(pq.size() > k){
                pq.poll();
            }
        }
        List<Integer> res = new ArrayList<>(pq);
        Collections.sort(res);
        return res;
    }
}
// n log n