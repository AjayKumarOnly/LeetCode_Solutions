class Solution {
    public int maxPower(String s) {
        int maxi = Integer.MIN_VALUE;
        int cnt = 1;
        if(s.length() == 1)return 1;
       for(int i=0; i < s.length()-1;i++){
            if(s.charAt(i) != s.charAt(i+1)){
                maxi = Math.max(maxi,cnt);
                cnt = 1;
            }
            else{
                cnt++;
            }
       }
       maxi = Math.max(cnt,maxi);
       return maxi;
    }
}