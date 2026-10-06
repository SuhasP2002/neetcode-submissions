class Solution {
    public int maxArea(int[] heights) {
        int maxWater = 0;
        int left = 0;
        int right = heights.length - 1;

        while (left < right) {
            int currentWidth = right - left;
            int minHeight = Math.min(heights[left], heights[right]);
            int currentWater = currentWidth * minHeight;

            maxWater = Math.max(maxWater, currentWater);

            // Move the pointer pointing to the shorter line
            if (heights[left] < heights[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxWater;
    }
}