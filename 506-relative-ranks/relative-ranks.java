class Solution {
    public String[] findRelativeRanks(int[] score) 
    {
        Integer a[] = new Integer[score.length];
        
        for (int i = 0; i < score.length; i++) {
            a[i] = score[i];
        }

        Arrays.sort(a, Collections.reverseOrder());

        String res[]=new String[score.length];        

        for(int i=0;i<score.length;i++)
        {
            int temp=score[i];
            int t=0;
            for(int j=0;j<a.length;j++)
            {
                if(a[j]==temp)
                {
                    t=j;
                    break;
                }
            }

            if(t==0)
            {
                res[i]="Gold Medal";
            }

            else if(t==1)
            {
                res[i]="Silver Medal";
            }

            else if(t==2)
            {
                res[i]="Bronze Medal";
            }

            else
            {
                res[i]=String.valueOf(t+1);
            }
        }
        
        return res;
    }
}