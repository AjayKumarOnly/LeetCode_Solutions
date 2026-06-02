class Solution {
    public int[] numberOfPairs(int[] nums) {
        Map<Integer,Integer> mpp = new HashMap<>();
        for(int i : nums){
            mpp.put(i,mpp.getOrDefault(i,0)+1);
        }
        int pair = 0 , leftOver = 0;
        for(Map.Entry<Integer,Integer> entry : mpp.entrySet()){
                int freq = entry.getValue();
                pair += freq / 2;
                leftOver += freq % 2;
        }
        return new int[]{pair,leftOver};
    }
}