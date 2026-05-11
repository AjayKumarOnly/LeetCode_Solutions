class Solution {
    public int alternateDigitSum(int n) {
        String num = String.valueOf(n);
        int ans = 0;
        for(int i=0;i<num.length();i++){
            if(i==0) ans += Integer.parseInt(String.valueOf(num.charAt(i)));
            else if (i%2 != 0) ans -= Integer.parseInt(String.valueOf(num.charAt(i)));
            else if(i % 2 == 0){
                ans += Integer.parseInt(String.valueOf(num.charAt(i)));
            }
        }
        return ans;
    }
}