class Solution {
    public boolean uniformArray(int[] nums1) {
        int minOdd = Integer.MAX_VALUE;

        for(int i : nums1){
            if(i % 2 == 1){
                minOdd = Math.min(minOdd,i);
            }
        }
        if(minOdd == Integer.MAX_VALUE) return true; // All even numbers...

        for(int i : nums1){
            if(i % 2 == 0 && i < minOdd) return false;
        }
        return true;
    }
}