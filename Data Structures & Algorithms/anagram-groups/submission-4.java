class Solution 
{
    public List<List<String>> groupAnagrams(String[] strs) 
    {
        HashMap<String,List<String>> hMap = new HashMap<>();
        for(String s : strs)
        {
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sorted = new String(charArray);

            hMap.putIfAbsent(sorted, new ArrayList<>());
            hMap.get(sorted).add(s);
        }
        return new ArrayList<>(hMap.values());
    }
}
