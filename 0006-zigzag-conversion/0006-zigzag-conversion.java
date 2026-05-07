class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1 || s.length() <= numRows) return s;

        List<Character>[] rows = new ArrayList[numRows];

        int index = 0 , dir = 1;
        for(int i = 0;i < numRows; i++){
            rows[i] = new ArrayList<>();
        }

        for(char c : s.toCharArray()){
            rows[index].add(c);
            if(index == 0) dir =1;
            else if (index == numRows - 1) dir = -1;
            index += dir;
        }
        StringBuilder res = new StringBuilder();
        for(List<Character> row : rows){
            for(char c : row){
                res.append(c);
            }
        }
       return  res.toString();
    }
}