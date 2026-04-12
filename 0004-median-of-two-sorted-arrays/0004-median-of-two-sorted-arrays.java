class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int merged[] = merge(nums1,nums2);
        int n = merged.length;
        if (n % 2 == 0) {
            
            return (merged[n / 2 - 1] + merged[n / 2]) / 2.0;
        } else {
           
            return merged[n / 2];
        }
    }
    public static int[] merge(int n1[],int n2[]){
        int i = 0 , j=0;
        int merged[] = new int[n1.length+n2.length];
        int k = 0;
        while(i < n1.length && j < n2.length){
            if(n1[i] <= n2[j]){
                merged[k] = n1[i++];
                k++;
            }else{
                merged[k] = n2[j++];
                k++;
            }
        }
        while(i < n1.length){
            merged[k++] = n1[i++];
        }
        while(j < n2.length){
            merged[k++] = n2[j++];
        }
        return merged;
    }
}