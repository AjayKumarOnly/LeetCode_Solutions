class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hset = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();

        for(int i : nums1){
            hset.add(i);
        }
        for(int i : nums2){
            if(hset.contains(i)){
                result.add(i);
            }
        }
        int[] answer = new int[result.size()];
        int ind = 0;
        for(int i : result){
            answer[ind++] = i;
        }
        return answer;
    }
}