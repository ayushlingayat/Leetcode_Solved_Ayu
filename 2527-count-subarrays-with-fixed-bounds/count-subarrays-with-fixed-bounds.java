class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) 
    {
        int minI=-1;
        int maxI=-1;
        long ans=0;
        int LeftBound=-1;

        for(int current=0;current<nums.length;current++)
        {
            if(nums[current]==minK) minI=current;

            if(nums[current]==maxK) maxI=current;

            if(nums[current]<minK || nums[current]>maxK)
            {
                LeftBound = current;
            }

            if(minI!=-1 && maxI!=-1)
            {
                int smaller = Math.min(minI,maxI);
            
                if((smaller-LeftBound)>0)
                {
                    ans+=(smaller-LeftBound);
                }
            }
        }

        return ans;
    }
}