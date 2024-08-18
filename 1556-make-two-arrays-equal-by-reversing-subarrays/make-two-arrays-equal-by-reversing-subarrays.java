class Solution {
    public boolean canBeEqual(int[] target, int[] arr) 
    {
        int counts[] = new int[1001];
        
        for(int n:target)
        {
            counts[n]++;
        }

        for(int n:arr)
        {
            counts[n]--;
        }

        for(int n: counts)
        {
            if(n!=0)
            {
                return false;
            }
        }

        return true;
    }
}