class Solution {
    public double averageWaitingTime(int[][] customers) 
    {
        if(customers==null || customers.length<1)
        {
            return 0;
        }

        int lastOrderedServedTime = -1;
        int serviceTime = 0;
        long totalServiceTime=0;

        for(int customer[]: customers)
        {
            if(lastOrderedServedTime<customer[0])
            {
                serviceTime=customer[1];
            }

            else
            {
                serviceTime = lastOrderedServedTime+customer[1]-customer[0];
            }

            lastOrderedServedTime = customer[0]+serviceTime;
            totalServiceTime += serviceTime;
        }
        
        return (double)totalServiceTime/customers.length;
    }
}