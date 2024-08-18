class Solution {
    static List<List<Integer>> ans;

    public List<List<Integer>> subsets(int[] a)
    {
        ans = new ArrayList<>();

        ArrayList<Integer> temp = new ArrayList<>();

        helper(0,a,temp);

        return ans;
    }

    public void helper(int i, int a[], List<Integer> temp)
    {
        if(i==a.length)
        {
            ArrayList<Integer> list = new ArrayList<>();
            for (int j = 0; j < temp.size(); j++)
            {
                list.add(temp.get(j));
            }
            ans.add(list);
            return;
        }

        helper(i+1,a,temp);
        temp.add(a[i]);
        helper(i+1,a,temp);
        temp.remove(temp.size()-1);
    }
}