class Solution {
    public int longestPalindrome(String s) {
        int hash[] = new int[128];
        for (char c : s.toCharArray()) {
            hash[c - '0']++;
        }
        boolean flag = false;
        int res = 0;
        for (int i : hash) {
            if (i % 2 == 0) {
                res += (i / 2); // ex -> 12 / 2 = 6
            } else {
                flag = true;
                res += (i - 1) / 2; // ex -> 13 -> 13 - 1 = 12 ; so 12 / 2 = 6 
            }
        }

        return flag ? (res * 2) + 1 : res * 2;
    }
}