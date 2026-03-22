class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i : nums) set.add(i);

        int longest = 0;
        for(int i : set){
            int curr = 0;
            if(!set.contains(i-1)){
                int j =i;
                while(set.contains(j)){
                    j++;
                    curr++;
                }
             longest = Math.max(longest,curr);
            }
           
        }
        return longest;
        
    }
}