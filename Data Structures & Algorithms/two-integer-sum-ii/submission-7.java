class Solution 
{
    public int[] twoSum(int[] numbers, int target) 
    {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for(int i=0; i<numbers.length; i++)
        {
            hashMap.put(numbers[i],i);
        }
        for(int i=0; i<numbers.length; i++)
        {
            int diff = target - numbers[i];
            if(hashMap.containsKey(diff) && hashMap.get(diff) != i)
            {
                return new int[] {i+1,hashMap.get(diff)+1};
            }
        }
        return new int[] {-1,-1};
    }
}
