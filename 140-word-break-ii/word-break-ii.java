class Solution {
    public List<String> wordBreak(String s, List<String> wordDict)
    {
        List<String> result= new ArrayList<>();

        if(s==null || s.length()==0) return result;

        if(wordDict.contains(s))
        {
            result.add(s);
        }

        for(int i=0;i<s.length();i++)
        {
            String temp=s.substring(i);

            if(wordDict.contains(temp))
            {
                List<String> tmp = wordBreak(s.substring(0,i),wordDict);
                
                if(tmp.size()>0)
                {
                    for(int j=0;j<tmp.size();j++)
                    {
                        result.add(tmp.get(j)+" "+temp);
                    }
                }
            }
        }
        
        return result;
    }
}