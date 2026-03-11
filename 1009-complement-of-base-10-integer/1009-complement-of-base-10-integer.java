class Solution {
    public int bitwiseComplement(int n) {
        if (n==0)return 1;
        String binaryNumber = Integer.toBinaryString(n);
        int bitLen = binaryNumber.length();

        int mask = ( 1 << bitLen)-1;
        int result = n ^ mask;
        return result;
    }
}