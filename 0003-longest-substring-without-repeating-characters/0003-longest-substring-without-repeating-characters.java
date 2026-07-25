class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int st = 0, end = 0 , max = 0;
        while(end < s.length()){
            if(!set.contains(s.charAt(end))){
                set.add(s.charAt(end));
                end++;
                max=Math.max(max,set.size());
            }
            else {
                set.remove(s.charAt(st++));
                
            }
           
        }
        return max;
    }
}