class Solution {
    public int totalWaviness(int num1, int num2) {
        int totalWaviness = 0;
        for(int i = num1; i <= num2; i++){
            String n1 = String.valueOf(i);
            if(n1.length() <= 2) continue;
            totalWaviness += findPeakAndValley(n1);
        }
        return totalWaviness;
    }
    private int findPeakAndValley(String num){
        int cnt = 0;
        for(char i=1;i<num.length()-1;i++){
            char start = num.charAt(i-1);
            char end = num.charAt(i+1);
            char curr = num.charAt(i);

            if(start < curr && curr > end) cnt++;
            if(start > curr && curr < end) cnt++;
        }
        return cnt;
    }
}