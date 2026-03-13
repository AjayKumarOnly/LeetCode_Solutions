class Solution {
    public int compress(char[] chars) {
        int index = 0 , cnt = 0;
        for(int i = 0; i < chars.length; i++){
            cnt++;
            if(i+1 == chars.length || chars[i] != chars[i+1]){
                chars[index++] = chars[i];
                if(cnt != 1){
                    for(char c : Integer.toString(cnt).toCharArray()){
                         chars[index++] = c;
                    }
                }
                 cnt = 0;
            }
           
        }
        return index;
    }
}