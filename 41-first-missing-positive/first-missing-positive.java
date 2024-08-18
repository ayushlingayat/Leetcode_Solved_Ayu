class Solution {
    public int firstMissingPositive(int[] a)
    {
        int n=a.length;
        
        for(int i=0;i<n;i++)
        {
        	int ele = a[i]; 
                     	         	
         	if(ele>=1 && ele<=n)
         	{
         		int chair = ele-1;
         		if(a[chair]!=ele)
             	{
             		int temp=a[chair];
             		a[chair]=a[i];
             		a[i]=temp;
             		i--;         		
             	}
         	}
        }
         
        for(int i=0;i<n;i++)
        {
        	if(i+1!=a[i]) return i+1;
        }
        
        return n+1;                
    }
}