class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        for(int i = 0; i < arr.length;i++){
            int ans = 0;
            int cnt = 0;
            for(int j = i; j<arr.length;j++){
                ans += arr[j];
                cnt++;
                if(cnt % 2 != 0){
                    sum += ans;
                }
            }
        }
        return sum;
    }
}