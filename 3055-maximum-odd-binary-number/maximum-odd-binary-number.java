class Solution {
    public String maximumOddBinaryNumber(String s) {
        if(s.length()==1) return s;
		
        StringBuilder ans = new StringBuilder();
        
        int c1=0, c0=0;        
        for(int i=0;i<s.length();i++)
        {
        	if(s.charAt(i)=='1') c1++;
        	else c0++;
        }
        
        for(int i=0;i<c1-1;i++)
        {
        	ans.append('1');
        }
        
        for(int i=0;i<c0;i++)
        {
        	ans.append('0');
        }
        
        ans.append('1');
        
        return ans.toString();
    }
}