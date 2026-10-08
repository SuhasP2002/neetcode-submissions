class Solution 
{
    public int maxArea(int[] heights) 
    {
        int maxWater = 0;
        int left = 0;
        int right = heights.length-1;

        while(left <right)
        {

            int width = right - left;
            int minHeight = Math.min(heights[left],heights[right]);

            int currentWater = width * minHeight;
            maxWater = Math.max(maxWater, currentWater);

            if(heights[left] < heights[right])
            {
                left++;
            }
            else
            {
                right--;
            }
            
        }
        return maxWater;
    }
}
