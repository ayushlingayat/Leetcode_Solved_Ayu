class Solution {
    public long countSubarrays(int[] a, int k)
    {
        int n[]= a;
        int max = Integer.MIN_VALUE;
        int left=0,c=0;

        for(int i=0;i<a.length;i++)
        {
            max = Math.max(max,a[i]);
        }

        long res=0;

        for(int right=0;right<a.length;right++)
        {
            if(n[right]==max) c++;

            while(c>=k)
            {
                if(n[left]==max) c--;
                left++;
            }

            res+=left;
        }
        
        return res;
    }
}