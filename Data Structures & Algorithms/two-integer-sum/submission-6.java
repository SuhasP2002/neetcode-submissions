class Solution 
{
    public int[] twoSum(int[] nums, int target) 
    {
        HashMap<Integer,Integer> hMap = new HashMap<>();
        for(int i=0; i< nums.length;i++)
        {
            hMap.put(nums[i],i);
        }
        for(int i=0; i< nums.length;i++)
        {
            int diff = target-nums[i];
            if(hMap.containsKey(diff) && hMap.get(diff) != i)
            {
                return new int[] {i,hMap.get(diff)};
            }
        }
        return new int[] {-1,-1};
    }
}
