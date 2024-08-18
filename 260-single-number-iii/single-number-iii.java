class Solution {
    public int[] singleNumber(int[] nums) 
    {
        int x=0;
        
        for(int n:nums)
        {
            x^=n;
        }

        x &= -x;

        int res[]=new int[2];

        for(int n:nums)
        {
            if((x & n)==0)
            {
                res[0]^=n;
            }

            else
            {
                res[1]^=n;
            }
        }
        
        return res;
    }
}