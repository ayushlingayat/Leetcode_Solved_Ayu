class Solution {
    public int[] rearrangeArray(int[] n)
    {
        int ans[] = new int[n.length];
        int p=0,q=1;
        
        for(int i=0;i<n.length;i++)
        {
        	if(n[i]>0)
        	{
        		ans[p]=n[i];
        		p+=2;
        	}
        	
        	else if(n[i]<0)
        	{
        		ans[q]=n[i];
        		q+=2;
        	}
        }
        
        return ans;
    }
}