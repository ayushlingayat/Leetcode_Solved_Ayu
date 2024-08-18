class Solution {
    public int findNumbers(int[] a) {
        int c=0;

        for(int i:a)
        {
            if(((int)Math.log10(i)+1)%2==0) c++;
        }

        return c;
    }
}