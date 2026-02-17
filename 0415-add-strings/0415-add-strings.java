class Solution {
    public String addStrings(String nums1, String nums2) {
        int i = nums1.length() -1;
        int j = nums2.length() -1;
        int carry = 0;
        StringBuilder res = new StringBuilder();

        while( i >= 0 || j >= 0 || carry != 0){
            int digit1 = (i >= 0) ? nums1.charAt(i) - '0' : 0;
            int digit2 = (j >= 0) ? nums2.charAt(j) - '0' : 0;

            int sum = digit1 + digit2 + carry;
            res.append(sum % 10);
           carry =  sum / 10;
           i--;
           j--;
        }
        return res.reverse().toString();
    }
}