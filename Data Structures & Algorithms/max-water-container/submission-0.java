class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int maxArea = (right - left) * Math.min(heights[left], heights[right]);
        int area = 0;

        while(right > left) {
            area = (right - left) * Math.min(heights[left], heights[right]);
            if(area > maxArea) {
                maxArea = area;
            }
            if(heights[left] < heights[right]) {
                left++;
            }
            else if(heights[left] > heights[right]) {
                right--;
            }
            else {
                left++;
            }
        }

        return maxArea;


    }
}
