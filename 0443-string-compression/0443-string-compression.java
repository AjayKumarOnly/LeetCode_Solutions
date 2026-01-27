class Solution {
    public int compress(char[] chars) {
        String code="";
        int run = 0; 
        char ptr = chars[0];
        for(char ch : chars){
            if(ptr == ch) run++;
            else{
                code += ptr + (run > 1 ? ""+run: "");
                run = 1;
                ptr = ch;
            }
        }
        code += ptr + (run > 1 ? ""+run: "");
        for(int i = 0; i < code.length();i++){
            chars[i] = code.charAt(i);
        }
        return code.length();

    }
}