class FreqComparator implements Comparator<Map.Entry<Integer,Integer>>{
    public int compare(Map.Entry<Integer,Integer> a, Map.Entry<Integer,Integer> b){
        if(a.getValue() == b.getValue()){
            return b.getKey() - a.getKey();
        }
        return a.getValue() - b.getValue();
    }
}
class Solution {
    public int[] frequencySort(int[] nums) {
        PriorityQueue<Map.Entry<Integer,Integer>> minHeap = new PriorityQueue<>(new FreqComparator());
        HashMap<Integer,Integer> mpp = new HashMap<>();
        for(int i : nums){
            mpp.put(i , mpp.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : mpp.entrySet()){
            minHeap.offer(entry);
        }
        int[] result = new int[nums.length];
        int index = 0;

        while(!minHeap.isEmpty()) {

            Map.Entry<Integer,Integer> entry = minHeap.poll();

            int num = entry.getKey();
            int freq = entry.getValue();

            for(int i = 0; i < freq; i++) {
                result[index++] = num;
            }
        }

        return result;
    }
}
// O(n) + O( n log n )