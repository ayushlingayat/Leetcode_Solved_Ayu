class Solution {
    public int maxSubArray(int[] n) {
        
        if(n.length==1) return n[0];

        int currsum=n[0];
		int maxsum=n[0];
		
		for(int i=1;i<n.length;i++)
		{
			currsum = Math.max(n[i],currsum+n[i]);
			
			maxsum = Math.max(maxsum, currsum);
		}        
		
		return maxsum;
    }
}