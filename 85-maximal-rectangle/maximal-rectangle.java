class Solution {
    public int maximalRectangle(char[][] matrix) 
    {
        if(matrix.length==0)
        {
            return 0;
        }

        int height[] = new int[matrix[0].length];
        int largest =0;

        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
                int val = matrix[i][j]-'0';
                if(val==0)
                {
                    height[j]=0;
                }

                else
                {
                    height[j]+=val;
                }
            }

            int area = LargestRectangleArea(height);

            if(largest<area)
            {
                largest = area;
            }
        }

        return largest;
    }

    public int LargestRectangleArea(int height[])
    {
        int stack[] = new int[height.length];
        int index=-1;

        int max=0;
        int n=height.length;

        for(int i=0;i<n;i++)
        {
            while(index!=-1 && height[stack[index]]>height[i])
            {
                int h=height[stack[index--]];
                int ps=(index==-1)?-1:stack[index];
                int w=i-ps-1;
                max=Math.max(max,(h*w));
            }

            stack[++index]=i;
        }

        while(index!=-1)
        {
            int h=height[stack[index--]];
            int ps=(index==-1)?-1:stack[index];
            int w=n-ps-1;
            max=Math.max(max,(h*w));
        }

        return max;
    }
}