 
class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        PriorityQueue<String> pq = new PriorityQueue<>((a,b)->{
            if(a.length() != b.length()) return a.length() - b.length();
            return a.compareTo(b);
        });
        for(String s : nums){
            pq.offer(s);
            if(pq.size() > k){
                pq.poll();
            }
        }
        return pq.poll();
    }
}