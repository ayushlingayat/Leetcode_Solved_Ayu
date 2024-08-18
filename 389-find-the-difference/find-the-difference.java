class Solution {
    public char findTheDifference(String s, String t) {

        int n[] =new int[26];
		
		for(char i: s.toCharArray())
		{
			n[i-'a']++;
		}
		
		for(char i: t.toCharArray())
		{
			n[i-'a']--;
		}
		
		for(int i=0;i<n.length;i++)
		{
			if(n[i]<0) return (char)(i+'a');
		}
		
		return ' ';
    }
}