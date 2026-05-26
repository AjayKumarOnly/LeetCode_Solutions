class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if(digits.isEmpty()) return result;
        String[] map = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        generate(digits,"",map,result);
        return result;
    }
    private void generate(String digits,String curr,String[] map,List<String> result){
        if(digits.length() == curr.length()){
            result.add(curr);
            return;
        }
        String letter = map[digits.charAt(curr.length() )-'0'];
        for(char c : letter.toCharArray()){
            generate(digits,curr+c,map,result);
        }
    }
}