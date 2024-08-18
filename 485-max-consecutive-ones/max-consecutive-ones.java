class Solution {
    public int findMaxConsecutiveOnes(int[] a) 
    {
        if(a.length==1 && a[0]==1) return 1;

        int c=0,max=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==1) c++;			
			else c=0;
			
			max=Math.max(max,c);
		}
        
		return max;
    }
}