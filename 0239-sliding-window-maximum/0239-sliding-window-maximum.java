// using monotonic deque

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums.length == 0)return new int[0];
        
        int[] result = new int[nums.length-k+1];
        Deque<Integer> dq = new ArrayDeque<>();

        for(int i=0;i<nums.length;i++){

            // this is for removing the element from window...
            if(!dq.isEmpty() && dq.peekFirst() <= i-k){
                dq.pollFirst();
            }

            // keep the deque monotonic (decresing order) 
            while(!dq.isEmpty() && nums[dq.peekLast()] < nums[i]){
                dq.pollLast();
            }
            dq.addLast(i);
            if(i >= k-1){
                result[i-k+1] = nums[dq.peekFirst()];
            }
        }
        return result;
    }
}