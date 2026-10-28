class Solution 
{
    public List<List<String>> groupAnagrams(String[] strs) 
    {
        Map<String,List<String>> hMap = new HashMap<>();
        for(String str : strs)
        {
            char[] charArr = str.toCharArray();
            Arrays.sort(charArr);

            String sorted = new String(charArr);
            hMap.putIfAbsent(sorted, new ArrayList<>());
            hMap.get(sorted).add(str);
        }
        return new ArrayList<>(hMap.values());
    }
}
