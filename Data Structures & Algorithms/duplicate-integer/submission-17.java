class Solution 
{
    public boolean hasDuplicate(int[] nums) 
    {
        Set<Integer> hSet = new HashSet<>();
        for(int num:nums)
        {
            if(hSet.contains(num))
            {
                return true;
            }
            else
            {
                hSet.add(num);
            }
        }
        return false;
    }
}