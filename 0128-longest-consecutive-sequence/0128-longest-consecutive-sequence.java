class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i : nums) set.add(i);

        int longest = 0; 
        for(int i : set){
            int cnt = 0;
            if(!set.contains(i-1)){
                int curr = i;
                while(set.contains(curr)){
                    cnt++;
                    curr++;
                }
                longest = Math.max(longest,cnt);
            }
        }
        return longest;
    }
}