class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res = new ArrayList<>();
        for(int i = left ; i <= right; i++){
            if(isDivisible(i)){
                res.add(i);
            }
        }
        return res;
    }
    static boolean isDivisible(int num){
        int divisor = num;
        while(divisor > 0){
            int digit = divisor % 10;
            if(digit == 0) return false;
            if(num % digit != 0) return false;
            divisor /= 10;
        }
        return true;
    }
}