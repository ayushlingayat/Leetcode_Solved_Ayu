class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) 
    {
        Queue<Integer> q=new LinkedList<>();
		
		int c=0;
		
		for(int i=0;i<tickets.length;i++)
		{
			q.add(i);
		}
		
		
		while(!q.isEmpty())
		{
			int t=q.poll();
			if(tickets[t]>0)
			{
				tickets[t]--;
				c++;
			}
			
			if(t==k && tickets[t]==0)
			{
				return c;
			}
			
			q.add(t);
		}

        return 0;        
    }
}