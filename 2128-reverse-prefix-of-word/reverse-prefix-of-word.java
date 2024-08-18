class Solution {
    public String reversePrefix(String word, char ch) 
    {
        int t=-1;

        for(int i=0;i<word.length();i++)
        {
            if(word.charAt(i)==ch)
            {
                t=i;
                break;
            }
        }

        if(t>=0)
        {
            StringBuilder s=new StringBuilder();

            for(int i=0;i<=t;i++)
            {
                s.append(word.charAt(i));
            }

            s = s.reverse();

            for(int i=t+1;i<word.length();i++)
            {
                s.append(word.charAt(i));
            }

            return s.toString();
        }
    
        return word;
    }
}