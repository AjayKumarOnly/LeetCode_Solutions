class Solution {
    public int minInsertions(String s) {
        int insert = 0;
        int leftCount = 0;
        int i = 0 , len=s.length();

        while(i < len){
            if(s.charAt(i) == '(') {
                leftCount++;
                i++;
            }
            else {
                if(leftCount > 0){
                    leftCount--;
                }
                else{
                    insert++;
                }
                if(i < len -1 && s.charAt(i+1) == ')'){
                    i+=2;
                }
                else{
                    insert++;
                    i++;
                }
            }
        }
        insert += leftCount *2;
        return insert;
    }
}