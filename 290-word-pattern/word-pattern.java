class Solution {
    public boolean wordPattern(String p, String s) {
        String t[] = s.split(" ");
		
		if(p.length()!=t.length) return false;	
		
		HashSet<Character> m=new HashSet<>();
		HashSet<String> m1=new HashSet<>();
		
		for(int i=0;i<p.length();i++)
		{
			m.add(p.charAt(i));
			m1.add(t[i]);
		}
		
		if(m.size()!=m1.size()) return false;
		
		HashMap<Character,String> h = new HashMap<>();
		
		for(int i=0;i<p.length();i++)
		{
			char j = p.charAt(i);
			if(h.containsKey(j) && h.get(j).compareTo(t[i])!=0)
			{
				return false;
			}
			
			else
			{
				h.put(j,t[i]);
			}
		}
		
		return true;
    }
}