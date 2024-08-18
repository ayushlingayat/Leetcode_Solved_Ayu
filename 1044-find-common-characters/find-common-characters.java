class Solution {
    public List<String> commonChars(String[] words) 
    {
        int common[] = new int[26];
        Arrays.fill(common, Integer.MAX_VALUE);

        for(String word:words)
        {
            int cnt[] = new int[26];

            for(char c:word.toCharArray())
            {
                cnt[c-'a']++;
            }

            for(int i=0;i<26;i++)
            {
                common[i]=Math.min(common[i],cnt[i]);
            }
        } 

        List<String> ans=new ArrayList();

        for(int i=0;i<26;i++)
        {
            for(int j=0;j<common[i];j++)
            {
                ans.add(""+(char)('a'+i));
            }
        }

        return ans;
    }
}