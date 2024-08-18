class Solution {
    public int longestConsecutive(int[] n) {
        if(n.length == 0) return 0;

        else if(n.length==1) return 1;

        HashSet<Integer> h = new HashSet<>();
		
		for(int i:n)
		{
			h.add(i);
		}
		
		int c=0,max=0;
		
		for(int i=0;i<n.length;i++)
		{
			c=0;

            if(!h.contains(n[i]-1))
			{
				int idx = n[i];
				
				while(h.contains(idx++))
				{
					c++;
				}
			}
						
			max = Math.max(max,c);
		}
        
		return max;
    }
}