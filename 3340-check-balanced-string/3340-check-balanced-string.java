class Solution {
    public boolean isBalanced(String num) {
        int even = 0 , odd = 0;
        for(int i=0;i<num.length();i++){
            if(i % 2 == 0){
                int val = Character.getNumericValue(num.charAt(i));
                even += val;
            }
            else {
                int val = Character.getNumericValue(num.charAt(i));
                odd += val;
            }
        }
        return odd == even;
    }
}