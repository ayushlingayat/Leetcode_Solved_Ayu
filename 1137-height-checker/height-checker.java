class Solution {
    public int heightChecker(int[] expected) 
    {
        int n=expected.length;
        int count=0;
        int heights[] = new int[n];

        for(int i=0;i<n;i++)
        {
            heights[i]=expected[i];
        }

        Arrays.sort(heights);

        for(int i=0;i<n;i++)
        {
            if(heights[i]!=expected[i])
            {
                count++;
            }
        }
        
        return count;
    }
}