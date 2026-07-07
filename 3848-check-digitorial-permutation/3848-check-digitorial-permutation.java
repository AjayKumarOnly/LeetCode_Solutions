class Solution {
    public boolean isDigitorialPermutation(int n) {
        long sum = 0;
        String num = Integer.toString(n);

        for(int i = 0 ; i < num.length(); i++){
            sum += findFact(Character.getNumericValue(num.charAt(i)));
        }

        String strSum = Long.toString(sum);
        if(strSum.length() != num.length()) return false;
        if(strSum.charAt(0) == '0') return false;

        char[] org = num.toCharArray();
        char[] str = strSum.toCharArray();

        Arrays.sort(org);
        Arrays.sort(str);

        return Arrays.equals(str,org);
    }
    private int findFact(int n){
        int fact = 1;
        for(int i = 1; i <= n; i++){
            fact *= i;
        }
        return fact;
    }
}