class Solution {
    public int findJudge(int n, int[][] trust) {
        if(trust.length==0 && n==1) return n;

        else if(trust.length==0 && n>1) return -1;
		
		else if(trust.length==1) return trust[0][1]; 
		
		int a[]=new int[n+1];
		int b[]=new int[n+1];
		
		for(int p[]:trust)
		{
			a[p[0]]++;
			b[p[1]]++;
		}
		
		for(int i=1;i<b.length;i++)
		{
			if(b[i]==n-1 && a[i]==0)
			{
				return i;
			}
		}
		
		return -1;
    }
}