class Solution 
{
    public int characterReplacement(String s, int k) 
    {
        HashMap<Character, Integer> hMap = new HashMap<>();
        int freq = 0;
        int left = 0;
        int res = 0;
        for(int i=0; i<s.length(); i++)
        {
            hMap.put(s.charAt(i), hMap.getOrDefault(s.charAt(i),0)+1);
            
            freq = Math.max(freq, hMap.get(s.charAt(i)));

            while((i-left+1)-freq > k)
            {
                hMap.put(s.charAt(left), hMap.get(s.charAt(left))-1);
                left++;
            }
            res = Math.max(res,i-left+1);
        }
        return res;
    }
}
