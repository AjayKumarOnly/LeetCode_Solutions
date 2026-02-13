class Solution {
    public boolean checkPerfectNumber(int num) {
         int sum=1;
        for(int i=2;i<Math.sqrt(num);i++){
            if(num%i==0) sum+=i;
        }
        return num%sum==0&&sum!=1;
    }
}