class Solution 
{
    public List<List<String>> groupAnagrams(String[] strs) 
    {
        Map<String, List<String>> hash = new HashMap<>();
        for(String str: strs)
        {
            char[] charArr = str.toCharArray();
            Arrays.sort(charArr);

            String sortedArray = new String(charArr);
            hash.putIfAbsent(sortedArray,new ArrayList<>());

            hash.get(sortedArray).add(str);

        }
        return new ArrayList<>(hash.values());
    }
}
