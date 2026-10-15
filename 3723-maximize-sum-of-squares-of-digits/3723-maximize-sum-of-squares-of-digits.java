class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if(sum > 9 * num)  return "";

        int remain = sum % 9;
        StringBuilder sb = new StringBuilder();

        int nine = sum / 9;

        for(int i= 0;i< nine;i++){
            sb.append("9");
        } 
        if(remain > 0) sb.append((char)('0'+ remain));
        int zero = num - sb.length();
        for(int i=0;i<zero;i++){
            sb.append('0');
        }
        return sb.toString();
    }
}