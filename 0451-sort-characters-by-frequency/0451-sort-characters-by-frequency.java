class StringComparator implements Comparator<Map.Entry<Character,Integer>>{
    public int compare(Map.Entry<Character,Integer> a , Map.Entry<Character,Integer> b){
        if(a.getValue().equals(b.getValue())){
            return b.getKey() - a.getKey();
        }
        return  b.getValue() - a.getValue();
    }
}
class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> mpp = new HashMap<>();

        for(char c : s.toCharArray()){
            mpp.put(c,mpp.getOrDefault(c,0)+1);
        }

        List<Map.Entry<Character, Integer>> list =
            new ArrayList<>(mpp.entrySet());

        list.sort(new StringComparator());

        StringBuilder sb = new StringBuilder();
        for(Map.Entry<Character,Integer> i : list){
            for(int c =0;c<i.getValue();c++){
                sb.append(i.getKey());
            }
        }
        return sb.toString();
    }
}