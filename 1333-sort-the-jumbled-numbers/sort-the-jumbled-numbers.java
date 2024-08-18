class Solution {
    public int[] sortJumbled(int[] mapping, int[] nums) 
    {
        int n=nums.length;
        int mapped[][] = new int[n][2];

        for(int i=0;i<n;i++)
        {
            mapped[i][0] = nums[i];

            if(nums[i]==0)
                mapped[i][1] = mapping[0];

            else
            {
                int mappedValue = 0;
                int multipler = 1;

                for(int j=nums[i];j>0;j/=10)
                {
                    mappedValue += (mapping[j%10] * multipler);
                    multipler *= 10;
                }

                mapped[i][1] = mappedValue;
            }
        }
        
        Arrays.sort(mapped, (a,b) -> Integer.compare(a[1], b[1]));

        for(int i=0;i<n;i++)
        {
            nums[i] = mapped[i][0];
        }

        return nums;
    }
}