class Solution {
    public String countAndSay(int n) {
        if(n==1) return "1";

        StringBuilder s = new StringBuilder(countAndSay(n-1));
        s.append("@");
        StringBuilder ans = new StringBuilder();
        int i=0,j=0;

        while(j<s.length())
        {
            if(s.charAt(i)==s.charAt(j)) j++;
            else {
                int len = j-i;
                ans.append(len);
                ans.append(s.charAt(i));
                i=j;
            }
        }

        return ans.toString();
    }
}