class Solution {
    public long minimumCost(String source, String target, char[] original, char[] changed, int[] cost) 
    {
        long distance[][] = new long[26][26];
        long res=0;

        for(long d[]:distance)
        {
            Arrays.fill(d, Integer.MAX_VALUE);
        }

        int n=original.length;

        for(int i=0;i<n;i++)
        {
            int c1=original[i]-'a';
            int c2=changed[i]-'a';

            distance[c1][c2] = Math.min(distance[c1][c2], cost[i]);
        }

        for(int k=0;k<26;k++)
        {
            for(int i=0;i<26;i++)
            {
                for(int j=0;j<26;j++)
                {
                    distance[i][j] = Math.min(distance[i][j], distance[i][k] + distance[k][j]);
                }
            }
        }

        int l=source.length();

        for(int i=0;i<l;i++)
        {
            int c1=source.charAt(i)-'a';
            int c2=target.charAt(i)-'a';

            if(c1==c2)
            {
                continue;
            }

            if(distance[c1][c2] >= Integer.MAX_VALUE)
            {
                return -1;
            }

            res+=distance[c1][c2];
        }

        return res;        
    }
}