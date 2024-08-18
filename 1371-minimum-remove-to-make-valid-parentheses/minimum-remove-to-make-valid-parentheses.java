class Solution {
    public String minRemoveToMakeValid(String s) 
    {
        if(s.length()==1 && (s.charAt(0)==')' || s.charAt(0)=='('))
		{
			return "";
		}
		
		Stack<Integer> s1= new Stack<>();
		StringBuilder s2 = new StringBuilder();
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='(')
			{
				s1.add(i);
			}
			
			else if(s.charAt(i)==')' && s1.isEmpty())
			{
				s1.add(i);
			}
			
			else if(s.charAt(i)==')' && s.charAt(s1.peek())=='(')
			{
				s1.pop();
			}	
			
			else if(s.charAt(i)==')')
			{
				s1.add(i);
			}
		}
		
		for(int i=s.length()-1;i>=0;i--)
		{
			if(!s1.isEmpty() && i==s1.peek())
			{
				s1.pop();
			}
			
			else
			{
				s2.append(s.charAt(i));
			}
		}
		
		return s2.reverse().toString();	        
    }
}