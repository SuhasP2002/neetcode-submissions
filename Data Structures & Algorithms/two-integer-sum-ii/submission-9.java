class Solution 
{
    public int[] twoSum(int[] numbers, int target) 
    {
      Map<Integer,Integer> hash = new HashMap<>();
      for(int i=0; i<numbers.length; i++)
      {
        hash.put(numbers[i],i);
      }
      for(int i=0; i<numbers.length; i++)
      {
        int diff = target - numbers[i];
        if(hash.containsKey(diff) && hash.get(diff) != i)
        {
            return new int[]{i+1,hash.get(diff)+1};
        }
      }
      return new int[]{-1,-1};
    }
}
