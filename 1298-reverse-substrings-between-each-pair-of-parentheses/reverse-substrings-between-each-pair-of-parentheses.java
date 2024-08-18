class Solution {
    public String reverseParentheses(String s) 
    {
        StringBuilder res = new StringBuilder(s);
        int startIdx = res.lastIndexOf("(");
        int endIdx = res.indexOf(")", startIdx);

        while(startIdx != -1)
        {
            StringBuilder sb=new StringBuilder(res.substring(startIdx+1, endIdx));
            sb.reverse();
            res.replace(startIdx, endIdx+1, sb.toString());
            startIdx = res.lastIndexOf("(");
            endIdx = res.indexOf(")", startIdx);
        }

        return res.toString();
    }
}