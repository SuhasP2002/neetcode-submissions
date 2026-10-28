class Solution {

    public String encode(List<String> strs) 
    {
        StringBuilder sBuilder = new StringBuilder();
        for(String s : strs)
        {
            int n = s.length();
            sBuilder.append(n).append('#').append(s);
        }
        return sBuilder.toString();
    }

    public List<String> decode(String str) 
    {
        List<String> result = new ArrayList<>();
        int i = 0;
        while(i<str.length())
        {
            int j=i;
            while(str.charAt(j)!='#')
            {
                j++;
            }
            int length = Integer.parseInt(str.substring(i,j));
            i = j+1;
            j = length+i;

            result.add(str.substring(i,j));
            i=j;
        }
        return result;
    }
}
