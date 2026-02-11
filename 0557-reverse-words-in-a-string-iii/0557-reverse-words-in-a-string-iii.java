class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();

        for (String str : words) {
            StringBuilder rev = new StringBuilder(str).reverse();
            result.append(rev).append(" ");
        }

        result.deleteCharAt(result.length() - 1);
        return result.toString();
    }
}
