class Solution {
    public int numberOfSubstrings(String s) {
        int[] last = {-1, -1, -1};

        int ans = 0;

        for (int right = 0; right < s.length(); right++) {

            int ch = s.charAt(right) - 'a';

            last[ch] = right;

            int min = Math.min(last[0],
                       Math.min(last[1], last[2]));

            ans += min + 1;
        }

        return ans;
    }
}