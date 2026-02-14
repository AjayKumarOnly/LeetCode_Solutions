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
            if(v == 'A' || v== 'E' || v =='I' || v == 'O' || v == 'U' || v == 'a' || v== 'e' || v == 'i' || v == 'o' || v == 'u' ) {
                return true;
            }
            return false;
        }
}