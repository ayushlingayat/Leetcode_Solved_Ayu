class Solution {
    public String removeKdigits(String num, int k) 
    {
        if(num.length()==k) return "0";
        
        Stack<Character> s = new Stack<>();

		for (int i = 0; i < num.length(); i++) {
			char ch = num.charAt(i);

			while (!s.isEmpty() && k > 0 && ch < s.peek()) {
				s.pop();
				k--;
			}

			s.push(ch);
		}

		StringBuilder ans = new StringBuilder();

		while (!s.isEmpty()) {
			if (k > 0) {
				s.pop();
				k--;
			}

			else {
				ans.insert(0, s.pop());
			}
		}

		while (ans.length() > 0 && ans.charAt(0) == '0') {
			ans.deleteCharAt(0);
		}

		return ans.length() == 0 ? "0" : ans.toString();
    }
}