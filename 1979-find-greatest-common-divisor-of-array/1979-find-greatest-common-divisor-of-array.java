class Solution {
    public int findGCD(int[] nums) {
        int min = 1001 , max = -1;
        for(int i : nums){
            min = Math.min(i,min);
            max = Math.max(i,max);
        }

        return findGcd(min,max);
    }
    private int findGcd(int a , int b){
        if(b==0)return a;
        return findGcd(b,a%b);
    }
}