class Solution {
    public long maximumValueSum(int[] nums, int k, int[][] edges) 
    {
        long res=0;
        long sum1=0;
        long sum2=0;

        List<Integer> profit = new ArrayList<>();
        List<Integer> loss = new ArrayList<>();

        for(int num:nums)
        {
            int diff = (num^k)-num;
            if(diff>=0)
            {
                profit.add(diff);
                sum1+=(num^k);
            }

            else
            {
                loss.add(Math.abs(diff));
                sum2+=num;
            }
        }

        Collections.sort(profit);
        Collections.sort(loss);

        if(profit.size()%2==0)
        {
            return (sum1+sum2);
        }

        if(loss.size()>0)
        {
            return Math.max(sum1+sum2-profit.get(0), sum1+sum2-loss.get(0));
        }

        else
        {
            return (sum1+sum2-profit.get(0));
        }   
    }
}