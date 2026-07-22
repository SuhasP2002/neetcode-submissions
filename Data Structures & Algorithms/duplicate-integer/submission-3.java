class Solution {
    public boolean hasDuplicate(int[] nums) 
    {
        Set<Integer> dupCheck = new HashSet<>();
        for(int num : nums)
        {
            if(dupCheck.contains(num))
            {
                return true;
            }
            else
            {
                dupCheck.add(num);
            }
        }
        return false;
    }
}