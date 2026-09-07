import java.util.*;

class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> mpp = new HashMap<>();
        List<Integer> res = new ArrayList<>();
        
        for (int i : arr1) {
            mpp.put(i, mpp.getOrDefault(i, 0) + 1);
        }
     
        for (int i : arr2) {
            if (mpp.containsKey(i)) {
                int count = mpp.get(i); 
                for (int j = 0; j < count; j++) {
                    res.add(i);
                }
                mpp.remove(i); 
            }
        }
        
        List<Integer> remaining = new ArrayList<>();
        for (int key : mpp.keySet()) {
            int count = mpp.get(key);
            for (int j = 0; j < count; j++) {
                remaining.add(key);
            }
        }
        

        Collections.sort(remaining);
        res.addAll(remaining);
        
        return res.stream().mapToInt(i -> i).toArray();
    }
}