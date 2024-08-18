class Solution {
    int res=0;

    public int beautifulSubsets(int[] nums, int k) 
    {
        Arrays.sort(nums);
        helper(nums,k,0,new HashSet<>());
        return res;
    }

    public void helper(int nums[], int k, int i, Set<Integer> set)
    {
        if(i==nums.length)
        {
            if(set.size()>0)
            {
                res++;
            }

            return;
        }

        helper(nums,k,i+1,set);

        if(!set.contains(k+nums[i]) && !set.contains(-k+nums[i]))
        {
            set.add(nums[i]);
            helper(nums,k,i+1,set);
            set.remove(nums[i]);
        }
    }
}