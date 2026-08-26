class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        List<String> list = new ArrayList<>();

        for(int right = 0; right < s.length(); right++){
            if(s.charAt(right) == '1'){
                int i = right;
                String res = "";
                int oneCnt = 0;
                while(i < s.length() && oneCnt != k){
                    if(s.charAt(i) == '1') oneCnt++;
                    res += s.charAt(i);
                    i++;
               }
              if(k == oneCnt) list.add(res);
            }
        }
        if(list.isEmpty()) return "";
        String ans = list.get(0);

        for (String str : list) {
            if (str.length() < ans.length() ||
                (str.length() == ans.length() && ans.compareTo(str) > 0)) {
                ans = str;
            }
        }
        return ans;
    }
}