class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        generate(res,0,0,"",n);
        return res;
    }
    private static void generate(List<String> res, int open,int close,String pair,int max){
        if(pair.length() == max*2){
            System.out.println(pair);   
            res.add(pair);
            return;
        }
    // max == n 
        if(open < max){
           // System.out.println("Left Side Called" + pair + " ");
              generate(res,open+1,close,pair + "(",max);
        }
        if(open > close){
          //  System.out.println("Right Side Called" + pair + " ");

            generate(res,open,close+1,pair + ")",max);
        }
    }
}