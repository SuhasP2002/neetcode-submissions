class Solution 
{
    public boolean isValid(String s) 
    {
        Stack<Character> stack = new Stack<>();
        Map<Character,Character> hMap = new HashMap<>();
        hMap.put(')','(');
        hMap.put('}','{');
        hMap.put(']','[');

        for(char c : s.toCharArray())
        {
            if(hMap.containsKey(c))
            {
                if(!stack.isEmpty() && stack.peek() == hMap.get(c))
                {
                    stack.pop();
                }
                else
                {
                    return false;
                }
            }
            else
            {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
