class Solution {
    public int numSubarrayProductLessThanK(int[] a, int k) 
    {
        if(a.length<=1) return 0;
		
		int i=0,product=1,ans=0;
		
		for(int j=0;j<a.length;j++)
		{
			product *=a[j];
			
			while(i<=j && product>=k)
			{
				product/=a[i];
				i++;
			}
			
			if(product<k)
			{
				ans+=j-i+1;
			}
		}
		
		return ans;
    }
}