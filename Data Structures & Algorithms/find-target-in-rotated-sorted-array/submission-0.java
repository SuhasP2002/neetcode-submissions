class Solution 
{
    public int search(int[] nums, int target) 
    {
        int start = 0;
        int end = nums.length-1;
        while(start < end)
        {
            int mid = start+(end-start)/2;
            if(nums[mid] > nums[end])
            {
                start = mid+1;
            }
            else
            {
                end = mid;
            }
        }
        int pivot = start;
        int result = binarySearch (nums,target, 0 , pivot-1);
        if(result != -1)
        {
            return result;
        }
        return binarySearch (nums,target, pivot, nums.length-1);
    }

    public int binarySearch(int[] nums,int target,int left,int right)
    {
        while(left <= right)
        {
            int mid = left + (right-left)/2;
            if(nums[mid] == target)
            {
                return mid;
            }
            else if(nums[mid]<target)
            {
                left = mid+1;
            }
            else
            {
                right = mid-1;
            }
        }
        return -1;
    }
}
