class Solution {
    static List<String> arr;

    public void print(int open, int close, int n, String ans)
    {
        if(ans.length()==2*n)
        {
            arr.add(ans);
            return;
        }
        
        if(open<n) print(open+1,close,n,ans+"(");
        if(close<open) print(open,close+1,n,ans+")");
    }

    public List<String> generateParenthesis(int n) {
        arr = new ArrayList<>(); //re-initialize
        print(0,0,n,"");

        return arr;
    }
}