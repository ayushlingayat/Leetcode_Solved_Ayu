class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        if(left==0) return 0;

        else if(left==right) return left;

        int t=0;

        while(left<right)
        {
            left>>=1;
            right>>=1;

            t++;
        }

        return left<<t; 
    }
}