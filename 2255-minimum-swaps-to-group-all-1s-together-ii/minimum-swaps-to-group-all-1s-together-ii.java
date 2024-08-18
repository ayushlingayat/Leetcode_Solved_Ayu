class Solution {
    public int minSwaps(int[] nums) 
    {
        int count=0;

        for(int v1:nums)
        {
            if(v1==1) count++;
        }

        int ans=0, czeros=0;

        for(int i=0;i<count;i++)
        {
            if(nums[i]==0) czeros++;
        }

        ans=czeros;

        int n=nums.length;

        for(int i=count;i<2*n;i++)
        {
            if(nums[i%n]==0) czeros++;

            if(nums[(i-count)%n]==0) czeros--;

            ans=Math.min(ans,czeros);
        }

        return ans;        
    }
}