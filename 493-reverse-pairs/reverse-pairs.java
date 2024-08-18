class Solution {
    static int count;

    public void inversion(int a[], int b[])
    {
        int i=0,j=0;

        while(i<a.length && j<b.length)
        {
            if((long)a[i]>((long)2*(long)b[j]))
            {
                count+=(a.length-i);
                j++;
            }

            else i++;
        }
    }

    public void merge(int a[], int b[], int c[])
    {
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length)
        {
            if(a[i]<=b[j])
            {
                c[k++]=a[i++];
            }

            else
            {
                c[k++]=b[j++];
            }
        }

        while(i<a.length)
        {
            c[k++]=a[i++];
        }

        while(j<b.length)
        {
            c[k++]=b[j++];
        }
    }

    public void mergesort(int a[])
    {
        int n=a.length;

        if(n==1) return; // base case

        // create two arrays of n/2 size each
        int a1[] = new int[n/2];
        int a2[]=new int[n-n/2];

        // copy pasting
        for(int i=0;i<n/2;i++)
        {
            a1[i]=a[i];
        }

        for(int i=0;i<n-n/2;i++)
        {
            a2[i]=a[i+n/2];
        }

        // magic
        mergesort(a1);
        mergesort(a2);

        inversion(a1,a2);

        // merge these 'a' and 'b'
        merge(a1,a2,a);

        // delete a1 and a2
        a1 = null;
        a2 = null;
    }

    public int reversePairs(int[] nums) 
    {
        count = 0;
        mergesort(nums);
        return count;        
    }
}