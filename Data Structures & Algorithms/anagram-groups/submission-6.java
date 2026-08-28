class Solution {
    public List<List<String>> groupAnagrams(String[] strs) 
    {
        HashMap<String, List<String>> hMap = new HashMap<>();
        for(String s : strs)
        {
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sortedS = new String(charArray);

            hMap.putIfAbsent(sortedS, new ArrayList<>());
            hMap.get(sortedS).add(s);
        }
        return new ArrayList<>(hMap.values());
    }
}
