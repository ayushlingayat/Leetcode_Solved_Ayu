class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) 
    {
        int diff[][] = new int[difficulty.length][2];

        for(int i=0;i<difficulty.length;i++)
        {
            diff[i][0]=difficulty[i];
            diff[i][1]=profit[i];
        }

        Arrays.sort(diff, (a,b) -> a[0]-b[0]);

        Arrays.sort(worker);
        int j=0;
        int mostProfit=0;

        int totalProfit=0;
        for(int i=0;i<worker.length;i++)
        {
            var ability=worker[i];

            while(j<diff.length && ability>=diff[j][0])
            {
                mostProfit=Math.max(mostProfit,diff[j][1]);
                j++;
            }

            totalProfit+=mostProfit;
        }

        return totalProfit;       
    }
}