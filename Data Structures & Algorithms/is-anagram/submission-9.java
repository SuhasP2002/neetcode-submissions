class Solution 
{
    public boolean isAnagram(String s, String t) 
    {
        Map<Character,Integer> hash1 = new HashMap<>();
        Map<Character,Integer> hash2 = new HashMap<>();
        if(s.length() != t.length())
        {
            return false;
        }
        for(int i=0; i< s.length();i++)
        {
            hash1.put(s.charAt(i),hash1.getOrDefault(s.charAt(i),0)+1);
            hash2.put(t.charAt(i),hash2.getOrDefault(t.charAt(i),0)+1);
        }
        if(hash1.equals(hash2))
        {
            return true;
        }
        return false;
    }
}
