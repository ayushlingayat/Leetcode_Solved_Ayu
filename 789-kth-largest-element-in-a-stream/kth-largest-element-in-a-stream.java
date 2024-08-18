class KthLargest {

    ArrayList<Integer> a;
    int K=0;

    public KthLargest(int k, int[] nums)
    {
        a=new ArrayList<>();

        for(int i:nums)
        {
            a.add(i);
        }        

        K=k;
    }
    
    public int add(int val) {
        a.add(val);
        Collections.sort(a);

        return a.get(a.size()-K);
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */