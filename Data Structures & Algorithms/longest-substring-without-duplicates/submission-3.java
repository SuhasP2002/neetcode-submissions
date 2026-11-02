class Solution 
{
    public int lengthOfLongestSubstring(String s) 
    {
        Set<Character> hash = new HashSet<>();
        int left = 0;
        int length = 0;
        int n = s.length();

        for(int i=0; i<n; i++)
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
