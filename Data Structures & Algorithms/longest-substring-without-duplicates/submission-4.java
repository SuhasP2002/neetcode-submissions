class Solution 
{
    public int lengthOfLongestSubstring(String s) 
    {
        int length=0;
        int left=0;
        Set<Character> hash = new HashSet<>();
        for(int i=0; i<s.length(); i++)
        {
            while(hash.contains(s.charAt(i)))
            {
                hash.remove(s.charAt(left));
                left++;
            }
            hash.add(s.charAt(i));
            length = Math.max(length, i-left+1);
        }
        return length;
    }
}
