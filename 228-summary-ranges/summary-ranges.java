class Solution 
{
    public List<String> summaryRanges(int[] a) 
    {
        List<String> res = new ArrayList<>();
		
		if(a.length==0) return res;

        if(a.length==1) 
		{
            res.add(""+a[0]);
            return res;
        }
		
		for(int i=0;i<a.length;i++)
		{
			int start = a[i];
			
			while(i+1<a.length && a[i+1]==a[i]+1)
			{
				i++;
			}
			
			if(start!=a[i])
			{
				res.add(""+start+"->"+a[i]);
			}
			
			else
			{
				res.add(""+start);
			}
			
		}
		
		return res;
    }
}