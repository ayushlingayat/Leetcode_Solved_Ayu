class Solution {
    public int compareVersion(String version1, String version2) 
    {
        int n1=version1.length();
        int n2=version2.length();
        int p1=0,p2=0;

        while(p1<n1 || p2<n2)
        {
            int num1=0;
            while(p1<n1 && version1.charAt(p1)!='.')
            {
                num1=num1*10 + (version1.charAt(p1)-'0');
                p1++;
            }

            int num2=0;
            while(p2<n2 && version2.charAt(p2)!='.')
            {
                num2=num2*10 + (version2.charAt(p2)-'0');
                p2++;
            }

            if(num1!=num2)
            {
                return (num1>num2)?1:-1;
            }

            p1++;
            p2++;
        }

        return 0;        
    }
}