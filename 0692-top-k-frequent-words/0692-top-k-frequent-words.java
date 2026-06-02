class WordFreqComparator implements Comparator<Map.Entry<String,Integer>>{
    public int compare(Map.Entry<String,Integer> a ,Map.Entry<String,Integer> b){
        if(a.getValue().equals(b.getValue())){
            return b.getKey().compareTo(a.getKey()); // higer lexicographical order 
        }
        return a.getValue() - b.getValue(); // negative ->  no change ||  pos -> change(swap) || this is minHeap;
    }
}
class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer> mpp = new HashMap<>();
        for(String s : words){
            mpp.put(s,mpp.getOrDefault(s,0)+1);
        }
        PriorityQueue<Map.Entry<String ,Integer>> minHeap = new PriorityQueue<>(new WordFreqComparator());
        for(Map.Entry<String,Integer> x : mpp.entrySet()) {
            minHeap.offer(x);
            if(minHeap.size() > k){
                minHeap.remove();
            }
        }
        List<String> res = new ArrayList<>();
        while(!minHeap.isEmpty()){
            res.add(0,minHeap.poll().getKey());
        }
        return res;
    }
}