class Solution {
    public int minHeightShelves(int[][] books, int shelfWidth) 
    {
        int n=books.length;
        int dp[] = new int[n+1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0]=0;

        for(int i=1;i<=n;i++)
        {
            int maxHeight = 0;
            int widthLeft = shelfWidth;

            for(int j=i-1;j>=0;j--)
            {
                widthLeft -= books[j][0];
                maxHeight = Math.max(maxHeight, books[j][1]);

                if(widthLeft>=0)
                {
                    dp[i] = Math.min(dp[i], dp[j]+maxHeight);
                }
            }
        }
        
        return dp[n];
    }
}