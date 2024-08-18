class Solution {
    public boolean checkValidString(String s) 
    {
        Stack<Integer> s1 = new Stack<>();
		Stack<Integer> s2 = new Stack<>();

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				s1.push(i);
			}

			else if (s.charAt(i) == '*') {
				s2.push(i);
			}

			else {
				if (!s1.isEmpty()) {
					s1.pop();
				}

				else if (!s2.isEmpty()) {
					s2.pop();
				}

				else {
					return false;
				}
			}
		}

		while (!s1.isEmpty()) {
			if(s2.isEmpty()) return false;
			
			else if (s2.peek() > s1.peek()) {
                s1.pop();
                s2.pop();
            }

			else return false;
		}

		return true;
    }
}