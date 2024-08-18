class Solution {

    private static final int MOD=1000000000+7;
 
    public int checkRecord(int n) 
    {
        int prevOp[][]=new int[2][3];

        prevOp[0][0]=1;
        prevOp[0][1]=1;
        prevOp[0][2]=1;
        prevOp[1][0]=1;
        prevOp[1][1]=1;
        prevOp[1][2]=1;

        for(int i=1;i<=n;i++)
        {
            int newOp[][]=new int[2][3];

            for(int a=0;a<2;a++)
            {
                for(int l=0;l<3;l++)
                {
                    newOp[a][l]+=prevOp[a][2];

                    if(a>0)
                    {
                        newOp[a][l]+=prevOp[a-1][2];
                        newOp[a][l]%=MOD;
                    }

                    if(l>0)
                    {
                        newOp[a][l]+=prevOp[a][l-1];
                        newOp[a][l]%=MOD;
                    }
                }
            }

            prevOp=newOp;
        }

        return prevOp[1][2];        
    }
}