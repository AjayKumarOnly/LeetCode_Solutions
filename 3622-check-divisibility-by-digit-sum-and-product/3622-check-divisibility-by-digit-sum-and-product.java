class Solution {
    public boolean checkDivisibility(int n) {
        String num = String.valueOf(n);
        int sum = 0 , product = 1 ;

        for(char c : num.toCharArray()){
            sum += Character.getNumericValue(c);
            product *= Character.getNumericValue(c);
        }
        return n % (sum + product) == 0;
    }
}