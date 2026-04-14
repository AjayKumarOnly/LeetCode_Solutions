class Solution {
    public int[] arrayRankTransform(int[] arr) {
       Map<Integer,Integer> res = new HashMap<>();
       int[] sortArr = Arrays.stream(arr).distinct().sorted().toArray();
       for(int i=0;i<sortArr.length;i++){
        res.put(sortArr[i],i+1);
       }
       for (int i = 0; i < arr.length; i++) {
            arr[i] = res.get(arr[i]);
        }
        return arr;
    }
}