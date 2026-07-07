class Solution {
    public long sumAndMultiply(int n) {
        String num = Integer.toString(n);
        StringBuilder res = new StringBuilder();
        long sum = 0;
        
        for (int i = 0; i < num.length(); i++) {
            char ch = num.charAt(i);
            if (ch == '0') continue;
            res.append(ch); 
            sum += Character.getNumericValue(ch);
        }
        
        if (sum == 0) return 0;

        long finalResult = Long.parseLong(res.toString());
        return finalResult * sum;
    }
}
