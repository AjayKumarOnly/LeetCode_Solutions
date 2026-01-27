class Solution {
    public String reverseOnlyLetters(String s) {
        char[] ans = s.toCharArray();
        int left = 0;
        int right = s.length() -1;
        while(left < right){
            if(!Character.isLetter(ans[left])) left++;
            else if(!Character.isLetter(ans[right])) right--;
            else{
                char temp = ans[left];
                ans[left] = ans[right];
                ans[right] = temp;
                left++;
                right--;
            }
        }
        return new String(ans);
    }
}