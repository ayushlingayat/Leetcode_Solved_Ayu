class Solution {
    public int maxDepth(String s) {
        int ans=0;
		
		Stack<Character> s1=new Stack<>();
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='(')
			{
				s1.push(s.charAt(i));
				ans= Math.max(ans,s1.size());
			}
			
			else if(s.charAt(i)==')')
			{
				s1.pop();
			}
		}
		
		return ans; 
    }
}