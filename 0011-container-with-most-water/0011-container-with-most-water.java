class Solution {
    public int maxArea(int[] height) {
        int i = 0; 
        int j = height.length-1;
        int maxi = -1;
        while(i <= j){
            int h = Math.min(height[i],height[j]);
            int width = j - i;
            int area = h * width;
            if(area > maxi) maxi = area;
            if(height[i] < height[j])i++;
            else j--;
        }
        return maxi;
    }
}