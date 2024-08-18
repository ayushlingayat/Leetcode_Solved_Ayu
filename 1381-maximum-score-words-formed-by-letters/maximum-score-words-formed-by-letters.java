class Solution {
    public int maxScoreWords(String[] words, char[] letters, int[] score) 
    {
        int count[]=new int[26];

        for(char c:letters)
        {
            count[c-'a']++;
        }

        return solve(0, words, count, score);        
    }

    public int solve(int i, String words[], int count[], int score[])
    {
        if(i>=words.length) return 0;

        int s=0;
        boolean possible=true;
        int clone[]=count.clone();

        for(char c:words[i].toCharArray())
        {
            if(clone[c-'a']>0)
            {
                clone[c-'a']--;
                s+=score[c-'a'];
            }

            else
            {
                possible=false;
                break;
            }
        }

        int ans=0;

        if(possible)
        {
            ans=s+solve(i+1, words, clone, score);
        }

        ans = Math.max(ans, solve(i+1, words, count, score));

        return ans;
    }
}