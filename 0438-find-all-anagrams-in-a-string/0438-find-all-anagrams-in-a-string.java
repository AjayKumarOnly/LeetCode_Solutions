class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        if(s.length() < p.length())return res;
        int left = 0, right = 0 , window = p.length();
        int[] sFreq = new int[26];
        int[] pFreq = new int[26];

        while(right < window){
            sFreq[s.charAt(right) - 'a']++;
            pFreq[p.charAt(right) - 'a']++;
            right++;
        }
        right--;

        while(right < s.length()){
            if(Arrays.equals(sFreq,pFreq)){
                res.add(left);
            }
            right++;

            if(right != s.length()){
                sFreq[s.charAt(right) - 'a']++;
            }
            sFreq[s.charAt(left) - 'a']--;
            left++;
        }
        return res;
    }
}