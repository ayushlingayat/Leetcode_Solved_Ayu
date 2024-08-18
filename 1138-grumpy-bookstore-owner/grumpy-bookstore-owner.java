class Solution {
    public int maxSatisfied(int customers[], int grumpy[], int X)
    {
        int sum=0;

        for(int i=0;i<customers.length;i++)
        {
            if(grumpy[i]==0)
            {
                sum+=customers[i];
            }
        }

        int satisfaction = sum;
        int start=0;
        int end=start+X-1;

        while(end<customers.length)
        {
            int tempSum=0;

            for(int i=start;i<=end;i++)
            {
                if(grumpy[i]==1)
                {
                    tempSum+=customers[i];
                }

                satisfaction = Math.max(satisfaction, (sum+tempSum));
            }

            start++;
            end++;
        }

        return satisfaction;
    }
}