class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character,Integer> vowel = new HashMap<>();
        HashMap<Character,Integer> con = new HashMap<>();
        for(char c : s.toCharArray()){
            if(c == 'a' || c == 'e' || c =='i' || c == 'u'|| c == 'o'){
                  vowel.put(c, vowel.getOrDefault(c, 0) + 1);
                continue;
            }else{
                con.put(c,con.getOrDefault(c,0)+1);
            }
             
        }
        int vowelCnt = 0, conCnt = 0;
        for(int a : vowel.values()){
            vowelCnt = Math.max(a,vowelCnt);
        }
        for(int a : con.values()){
            conCnt = Math.max(a,conCnt);
        }
        return vowelCnt + conCnt;

    }
}