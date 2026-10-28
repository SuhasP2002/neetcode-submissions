class Solution 
{
    public List<List<String>> groupAnagrams(String[] strs) 
    {
        Map<String,List<String>> hash = new HashMap<>();
        for(String s : strs)
        {
            char[] charArr = s.toCharArray();
            Arrays.sort(charArr);
            String sorted = new String(charArr);

            hash.putIfAbsent(sorted, new ArrayList<>());
            hash.get(sorted).add(s);
        }
        return new ArrayList<>(hash.values());
    }
}
