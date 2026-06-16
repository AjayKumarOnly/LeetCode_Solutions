class Solution {
    public int compress(char[] chars) {
        int cnt = 0 , ind = 0;
        for(int i = 0; i < chars.length; i++){
            cnt++;
            // i + 1 == chars.length [checks out of range]
            if(i + 1 == chars.length || chars[i] != chars[i+1]){
                chars[ind++] = chars[i];
                if(cnt != 1){
                    for(char c : Integer.toString(cnt).toCharArray()){ // ex cnt = 12 - > ['1','2']
                             chars[ind++] = c;
                    }
                }
                cnt = 0; // reset the cnt = 0
            }
        }
        return ind;
    }
}