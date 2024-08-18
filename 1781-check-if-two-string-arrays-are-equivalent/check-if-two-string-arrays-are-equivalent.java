class Solution {
    public boolean arrayStringsAreEqual(String[] a, String[] b) 
    {
        StringBuilder s = new StringBuilder();
        StringBuilder t = new StringBuilder();
        
        for(String i:a)
        {
        	s.append(i);
        }
        
        for(String i:b)
        {
        	t.append(i);
        }
        
        return s.toString().equals(t.toString());       
    }
}