class Solution {
    public int minDays(int[] bloomDay, int m, int k) {

        // Not enough flowers to make m bouquets
        if ((long) m * k > bloomDay.length) {
            return -1;
        }
        
        int low = 1;
        int high = 1;

        for (int day : bloomDay) {
            high = Math.max(high, day);
        }

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (isMinValidDay(bloomDay, mid , m, k, mid)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    private boolean isMinValidDay(int[] arr, int mid ,int m, int k, int day) {
          int flowers = 0;
        int bouquets = 0;

      for(int i =0; i < arr.length ; i++){
        if (arr[i] <= mid) flowers++;
        else flowers = 0;
         if (flowers==k) {
             bouquets++; 
             flowers=0;
             }
      }
      return bouquets>=m;
    }
}