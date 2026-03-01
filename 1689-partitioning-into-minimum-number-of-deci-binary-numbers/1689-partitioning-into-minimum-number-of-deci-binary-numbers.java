class Solution {
    public int minPartitions(String n) {
        int maxDigit = 0;
        for(int i = 0; i < n.length(); i++){
            int curr = n.charAt(i) - '0';
            if(curr > maxDigit) maxDigit = curr;
        }
        return maxDigit;
    }
}