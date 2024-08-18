class Solution {
    public String countOfAtoms(String s) 
    {
        int n = s.length();
        Stack<Pair<String, Integer>> stack = new Stack<>();
        
        for (int i = 0; i < n; i++) 
        {
            char ch = s.charAt(i);
            if (ch == '(') 
            {
                stack.push(new Pair<>(String.valueOf(ch), 0));
            } 
            
            else if (ch == ')') 
            {
                int mul = 0;
                while (i + 1 < n && Character.isDigit(s.charAt(i + 1))) 
                {
                    mul = mul * 10 + (s.charAt(i + 1) - '0');
                    i++;
                }
                
                if (mul == 0) mul = 1;
                
                Stack<Pair<String, Integer>> temp = new Stack<>();
                
                while (!stack.isEmpty() && !stack.peek().getKey().equals("(")) 
                {
                    Pair<String, Integer> p = stack.pop();
                    p = new Pair<>(p.getKey(), p.getValue() * mul);
                    temp.push(p);
                }
                stack.pop();
                while(temp.size() > 0) stack.push(temp.pop());
            } 
            
            else 
            {
                if (i + 1 < n) 
                {
                    String name = String.valueOf(ch);
                    if(Character.isLowerCase(s.charAt(i + 1))) 
                    {
                        name += s.charAt(i + 1);
                        i++;
                    }
                    
                    int count = 0;
                    
                    while(i + 1 < n && Character.isDigit(s.charAt(i + 1))) 
                    {
                        count = count * 10 + (s.charAt(i + 1) - '0');
                        i++;
                    }
                    
                    if(count == 0) count = 1;
                    stack.push(new Pair<>(name, count));
                } 
                
                else
                {
                    stack.push(new Pair<>(String.valueOf(ch), 1));
                }
            }
        }
        
        Map<String, Integer> mp = new TreeMap<>();
        while (!stack.isEmpty()) {
            Pair<String, Integer> p = stack.pop();
            mp.put(p.getKey(), mp.getOrDefault(p.getKey(), 0) + p.getValue());
        }
        
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Integer> entry : mp.entrySet()) {
            sb.append(entry.getKey());
            if (entry.getValue() > 1) {
                sb.append(entry.getValue());
            }
        }
        
        return sb.toString();
    }
}