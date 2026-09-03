class Solution {
    public long smallestNumber(long num) {
        if(num == 0) return 0;
        boolean isNeg = false , isZero = false;
        String n = "";
        int zeroCnt = 0;
        StringBuilder sb = new StringBuilder();

        for(char c : Long.toString(num).toCharArray()){
            if(c == '-'){
                isNeg = true;
                continue;
            }
            if(c == '0'){
                isZero = true;
                zeroCnt++;
                continue;
            }
            n += c;
        }
        char[] chars = n.toCharArray();
        Arrays.sort(chars);
       

        if(isNeg){
            sb.append("-");
            for (int i = chars.length - 1; i >= 0; i--) {
                sb.append(chars[i]);
            }
            if(zeroCnt != 0){
                while(zeroCnt-- > 0){
                    sb.append("0");
                }
            }
        }
        else{
            sb.append(chars);
             while(zeroCnt-- > 0){
                sb.insert(1,"0");
            }
        }
        
        return Long.parseLong(sb.toString());
    }
}