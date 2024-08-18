class Solution {
    public int minimumDeletions(String s) 
    {
        int n = s.length();

        int pre = 0;

        int total_deletions = 0;

        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='b')
            {
                pre++;
            }

            else if(s.charAt(i)=='a' && pre>0)
            {
                pre--;
                total_deletions++;
            }
        }        

        return total_deletions; 
    }
}