class Solution {
    public int maxDistance(int[] colors) {
        int n = colors.length, left = 0, right = n-1;
        while(colors[0] == colors[right]) right--;
        while(colors[n-1] == colors[left]) left++;
        return Math.max(right,n-1-left);
    }
}