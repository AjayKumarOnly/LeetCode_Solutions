class Solution {
    public int maxArea(int[] height) {
        int left = 0 , right = height.length -1 , maxi = 0;
        while(left <= right){
            int h = Math.min(height[left],height[right]);
            int width = right - left;
            int area = width * h;
            maxi = Math.max(area,maxi);
            if(height[left] < height[right]) left++;
            else right--;
        }
        return maxi;
    }
}