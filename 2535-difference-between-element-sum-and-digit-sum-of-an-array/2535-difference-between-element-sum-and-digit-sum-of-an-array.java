class Solution {
    public int differenceOfSum(int[] nums) {
        int sum = 0 , digit = 0;
        for(int i : nums){
            sum += i;
            if(i%10 != i){
                while(i > 0){

                    digit += i%10;
                    i /= 10;
                }
            }
            digit += i;
        }
        return Math.abs(sum - digit);
    }
}