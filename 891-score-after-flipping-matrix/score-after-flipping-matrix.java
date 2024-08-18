class Solution {
    public int matrixScore(int[][] arr) 
    {
        int m=arr.length,n=arr[0].length;
        
        //put 1 at the 0th position of every row
        for(int i=0;i<m;i++)
        {
            if(arr[i][0]==0) //flip that row
            {
                for(int j=0;j<n;j++)
                {
                    if(arr[i][j] ==0) arr[i][j]=1;

                    else arr[i][j] =0;
                }
            }
        }
        
        // flip those columns where (no. of 0s > no. of 1s)
        for(int j=1;j<n;j++)
        {
            int noOfZeroes = 0,noOfOnes=0;
            for(int i=0;i<m;i++)
            {
                if(arr[i][j]==0) noOfZeroes++;
                else noOfOnes++;
            }

            if(noOfZeroes>noOfOnes) // flip that column
            {
                for(int i=0;i<m;i++)
                {
                    if(arr[i][j]==0) arr[i][j]=1;
                    else arr[i][j]=0;
                }
            }
        }

        //calculating the score
        int sum=0,k=0;

        for(int i=0;i<m;i++)
        {
            k=1;
            for(int j=n-1;j>=0;j--)
            {
                sum += arr[i][j] * k;

                k*=2;
            }
        }

        return sum;
    }
}