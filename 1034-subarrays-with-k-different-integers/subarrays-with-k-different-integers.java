class Solution {
    public int subarraysWithKDistinct(int[] a, int k) 
    {
        return countSubarrayWithAtMostK(a,k)-countSubarrayWithAtMostK(a,k-1);
    }

    public int countSubarrayWithAtMostK(int a[], int k)
    {
        HashMap<Integer,Integer> h=new HashMap<>();

        int start=0;
        int end=0;
        int count=0;
        int n=a.length;

        while(end<n)
        {
            h.put(a[end], h.getOrDefault(a[end],0)+1);

            while(h.size()>k)
            {
                h.put(a[start], h.get(a[start])-1);
                if(h.get(a[start])==0)
                {
                    h.remove(a[start]);
                }
                start++;
            }
            count = count+(end-start+1);
            end++;
        }

        return count;
    }
}