class Solution {
    public boolean checkPrimeFrequency(int[] nums) {
        HashMap<Integer,Integer> mpp = new HashMap<>();

        for(int n : nums){
            mpp.put(n,mpp.getOrDefault(n,0)+1);
        }
        for(int i : mpp.values()){
            if(isPrime(i)) return true;
        }
        return false;
    }
    public boolean isPrime(int n){
        if(n <= 1) return false;
        for(int i = 2; i < n ; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}