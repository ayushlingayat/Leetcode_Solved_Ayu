class Solution {
    public int findDuplicate(int[] a) {
        int t[] = new int[a.length];
        
        for(int i=0;i<a.length;i++)
		{
        	t[a[i]]++;
		}
        
        for(int i=0;i<t.length;i++)
        {
        	if(t[i]>=2) return i;
        }
                
        return 0;        
    }
}