class Solution {
    public int[] separateDigits(int[] nums) {
        String temp = "";
        for(int n : nums){
            temp += String.valueOf(n);
        }
        int n = temp.length();
        int[] res = new int[n];
        for(int i=0;i<n;i++){
            res[i] = Integer.parseInt(String.valueOf(temp.charAt(i)));
        }
        return res;
    }
}