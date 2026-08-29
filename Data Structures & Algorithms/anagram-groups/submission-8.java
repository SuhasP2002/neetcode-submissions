class Solution 
{
    public List<List<String>> groupAnagrams(String[] strs) 
    {
        HashMap<String, List<String>> hMap = new HashMap<>();
        for( String s : strs)
        {
            char[] charArr = s.toCharArray();
            Arrays.sort(charArr);

            String sorted = new String(charArr);
            hMap.putIfAbsent(sorted, new ArrayList<>());
            hMap.get(sorted).add(s);
        }
        return new ArrayList<>(hMap.values());
    }
}
