class Solution 
{
    public List<List<String>> groupAnagrams(String[] strs) 
    {
        Map<String, List<String>> hmap = new HashMap<>();
        for(String s : strs)
        {
            char[] charArr = s.toCharArray();
            Arrays.sort(charArr);

            String sorted = new String(charArr);
            hmap.putIfAbsent(sorted, new ArrayList<>());

            hmap.get(sorted).add(s);

        }
        return new ArrayList<>(hmap.values());
    }
}
