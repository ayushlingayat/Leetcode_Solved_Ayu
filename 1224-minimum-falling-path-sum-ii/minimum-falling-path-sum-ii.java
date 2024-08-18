class Solution {
    public int minFallingPathSum(int[][] grid) 
    {
        for(int i=1;i<grid.length;i++)
        {
            int min1=Integer.MAX_VALUE,
            min2 = Integer.MAX_VALUE;

            for(int j=0;j<grid[0].length;j++)
            {
                if(min1>grid[i-1][j])
                {
                    min2=min1;
                    min1=grid[i-1][j];
                }

                else if(min2>grid[i-1][j])
                {
                    min2=grid[i-1][j];
                }
            }

            for(int j=0;j<grid[0].length;j++)
            {
                if(min1==grid[i-1][j])
                {
                    grid[i][j]+=min2;
                }

                else
                {
                    grid[i][j]+=min1;
                }
            }
        }

        int res=Integer.MAX_VALUE;

        int lastRow[]=grid[grid.length-1];

        for(int i=0;i<lastRow.length;i++)
        {
            res = Math.min(res,lastRow[i]);
        }
        
        return res;
    }
}