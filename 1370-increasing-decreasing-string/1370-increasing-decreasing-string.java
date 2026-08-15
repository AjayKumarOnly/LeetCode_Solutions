class Solution {
    public String sortString(String s) {
        int[] freq = new int[26];
        StringBuilder res = new StringBuilder();

        for(char c : s.toCharArray()){
            int ch = c - 'a';
            freq[ch]++;
        }
         while (res.length() < s.length()) {
            first(freq, res);
            second(freq, res);
        }

        return res.toString();

    }
     private void first(int[] freq, StringBuilder res) {
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                char ch = (char) ('a' + i);
                res.append(ch);
                freq[i]--;
            }
        }
    }

    private void second(int[] freq, StringBuilder res) {
        for (int i = 25; i >= 0; i--) {
            if (freq[i] > 0) {
                char ch = (char) ('a' + i);
                res.append(ch);
                freq[i]--;
            }
        }
    }
}