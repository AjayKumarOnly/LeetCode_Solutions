class Solution {
    public int numberOfSubstrings(String s) {
        // Array to store the last seen index of 'a', 'b', and 'c'
        // Initialize with -1 to indicate they haven't been seen yet.
        int[] lastSeen = {-1, -1, -1};
        int count = 0;
        
        for (int i = 0; i < s.length(); i++) {
            // Update the last seen index for the current character
            lastSeen[s.charAt(i) - 'a'] = i;
            
            // Find the minimum of the three last seen indices
            int minLastSeen = Math.min(lastSeen[0], Math.min(lastSeen[1], lastSeen[2]));
            
            // If all three characters have been seen at least once,
            // minLastSeen will be >= 0.
            // Any substring starting from index 0 up to minLastSeen and ending at 'i' is valid.
            if (minLastSeen != -1) {
                count += (minLastSeen + 1);
            }
        }
        
        return count;
    }
}