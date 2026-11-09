class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        List<String> temp = new ArrayList<>();

        backTracking(s,0,temp,res); // 0 -> Index
        return res;
    }
    private void backTracking(String s , int index , List<String> temp , List<List<String>> res){
        if(index == s.length()){
            res.add(new ArrayList<>(temp));
            return;
        }
        for(int i = index ; i < s.length() ; i++){
            if(isPalindrome(s,index,i)){
                temp.add(s.substring(index,i+1));

                backTracking(s,i+1,temp,res);

                temp.remove(temp.size()-1);
            }
        }
    }
    private boolean isPalindrome(String s , int left , int right){
        while(left < right){
            if(s.charAt(left) == s.charAt(right)){
                left++;
                right--;
            }
            else {
                return false;
            }
        }
        return true;
    }
}