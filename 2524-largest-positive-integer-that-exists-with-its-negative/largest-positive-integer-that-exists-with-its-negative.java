class Solution {
    public int findMaxK(int[] nums) 
    {
        Arrays.sort(nums);

        int l=0, h=nums.length-1;

        while(l<=h)
        {
            if(nums[h]==(-nums[l]))
            {
                return nums[h];
            }

            else if(-nums[l]>nums[h])
            {
                l++;
            }

            else
            {
                h--;
            }
        }
        
        return -1;
    }
}