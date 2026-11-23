class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList();
        generate(list,0,0,"",n);
        return list;
    }
    private void generate(List<String> list , int open , int close , String pair , int n){
        if(pair.length() == n*2){
            list.add(pair);
            return;
        }
        if(open < n){
            generate(list,open+1,close,pair+"(",n);

        }
         if(open > close){
            generate(list,open,close+1,pair+")",n);
            
        }
    }
}