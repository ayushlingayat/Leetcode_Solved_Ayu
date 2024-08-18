/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) 
    {
        if(head==null || head.next==null) return true;
        
        StringBuilder s = new StringBuilder();

        ListNode t=head;

        while(t!=null)
        {
            s.append(t.val);
            t=t.next;
        }

        int l=0,h=s.length()-1;

        while(l<=h)
        {
            if(s.charAt(l)!=s.charAt(h)) return false;

            l++;
            h--;
        }

        return true;  
    }
}