class Solution {
    public List<List<String>> groupAnagrams(String[] strs) 
    {
        Map<String, List<String>> hmap = new HashMap<>();
        for(String s: strs)
        {
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);

            String sorted = new String(charArray);
            hmap.putIfAbsent(sorted, new ArrayList<>());
            hmap.get(sorted).add(s);

            
        }
        return new ArrayList<>(hmap.values());
    }
}
