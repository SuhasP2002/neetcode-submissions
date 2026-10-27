class Solution 
{
    public int[] twoSum(int[] nums, int target) 
    {
        Map<Integer, Integer> hash1 = new HashMap<>();
        for(int i=0; i<nums.length; i++)
        {
            hash1.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++)
        {
            int diff = target - nums[i];
            if(hash1.containsKey(diff) && hash1.get(diff) != i)
            {
                return new int[]{i,hash1.get(diff)};
            }
        }
        return new int[]{-1,-1};
    }
}
