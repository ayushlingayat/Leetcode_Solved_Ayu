class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) 
    {
        HashMap<Integer,Integer> h=new HashMap<>();

        int a[]=new int[arr1.length];
        int k=0;

        for(int i:arr1)
        {
            h.put(i, h.getOrDefault(i,0)+1);
        }

        for(int i=0;i<arr2.length;i++)
        {
            int n=h.get(arr2[i]);

            while(n>0)
            {
                a[k]=arr2[i];
                k++;
                n--;
            }
        }

        ArrayList<Integer> al=new ArrayList<>();

        boolean b=true;

        for(int i=0;i<arr1.length;i++)
        {
            b=true;

            for(int j=0;j<arr2.length;j++)
            {
                if(arr1[i]==arr2[j])
                {
                    b=false;
                    break;
                }
            }

            if(b)
            {
                al.add(arr1[i]);
            }
        }

        Collections.sort(al);

        for(int i:al)
        {
            a[k]=i;
            k++;
        }

        return a;
    }
}