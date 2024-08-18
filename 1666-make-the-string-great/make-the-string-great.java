class Solution {
    public String makeGood(String s) 
    {
        StringBuilder s1=new StringBuilder();
		
		int n=s.length()-1;
        
        Stack<Character> s2 = new Stack<>(); 
        s2.add(s.charAt(0));
        
        for(int i=1;i<=n;i++)
        {
        	if(!s2.isEmpty() && (s2.peek()==(s.charAt(i)-32) || s2.peek()==(s.charAt(i)+32)))
        	{
        		s2.pop();
        	}
        	
        	else
        	{
        		s2.add(s.charAt(i));
        	}
        }
        
        if(!s2.isEmpty())
        {
        	for(int i=0;i<s2.size();i++)
            {
            	s1.append(s2.get(i));
            }
        }
        
        return s1.toString();
    }
}