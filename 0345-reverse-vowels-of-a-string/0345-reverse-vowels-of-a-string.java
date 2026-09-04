class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int start = 0;
        int end = s.length()-1;
        while(start < end){
            while(start < end && !isVowel(arr[start])) start++;
            while(start < end && !isVowel(arr[end])) end--;
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return new String(arr);
    }
    private boolean isVowel(char v){
            if("AEIOUaeiou".indexOf(v) == -1) {
                return false;
            }
            return true;
        }
}