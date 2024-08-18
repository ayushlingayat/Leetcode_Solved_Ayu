class Solution {
    public int findLeastNumOfUniqueInts(int[] a, int k) {

        HashMap<Integer,Integer> h=new HashMap<>();
		
		for(int i=0;i<a.length;i++)
		{
			if(h.containsKey(a[i]))
			{
				h.put(a[i],h.getOrDefault(a[i],0)+1);
			}
			
			else
			{
				h.put(a[i],1);
			}
		}
		
		PriorityQueue<Integer> q=new PriorityQueue<>(h.values());
				
		while(!q.isEmpty() && k>0 && q.peek()<=k)
		{
			if(q.peek()<=k)
			{
				k-=q.peek();
				q.remove();				
			}			
		}
		
		return q.size();
    }
}