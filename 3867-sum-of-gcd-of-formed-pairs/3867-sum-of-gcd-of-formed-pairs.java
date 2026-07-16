class Solution {
    public long gcdSum(int[] nums) {
        int[] prefixGcd = new int[nums.length];
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++){
            max = Math.max(max,nums[i]);
            prefixGcd[i] = (int)findGCD(nums[i],max);
        }

        Arrays.sort(prefixGcd);

        return sum(prefixGcd);
    }

    private long findGCD(int a , int b){
        if(b == 0) return a ;
        return findGCD(b,a%b);
    }

    private long sum(int[] arr){
        long s = 0;
        int left = 0;
        int right = arr.length - 1;

        while(left < right){
            s += findGCD(arr[left], arr[right]);
            left++;
            right--;
        }
        return s;
    }
}
