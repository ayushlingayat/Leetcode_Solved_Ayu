class Solution {
    public int minIncrementForUnique(int[] nums) 
    {
        Arrays.sort(nums);

        int result=0;

        for(int i=1;i<nums.length;i++)
        {
            int pre = nums[i-1];
            int cur=nums[i];

            if(pre>=cur)
            {
                result+=pre-cur+1;
                nums[i]=pre+1;
            }            
        }

        return result;        
    }
}