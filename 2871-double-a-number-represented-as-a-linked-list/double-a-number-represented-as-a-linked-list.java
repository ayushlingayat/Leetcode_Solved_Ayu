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
    public ListNode doubleIt(ListNode head) 
    {
        head = reverse(head);

        int carry=0;
        ListNode temp=null;
        while(head!=null)
        {
            int val=2*head.val;
            int compute=val+carry;
            carry=compute/10;
            compute%=10;
            ListNode t=new ListNode(compute);
            t.next=temp;
            temp=t;
            head=head.next;
        }

        if(carry!=0)
        {
            ListNode t=new ListNode(carry);
            t.next=temp;
            temp=t;
        }

        return temp;        
    }

    public ListNode reverse(ListNode head)
    {
        ListNode curr=head;
        ListNode prev=null;
        ListNode next=curr.next;

        while(next!=null)
        {
            curr.next =prev;
            prev=curr;
            curr=next;
            next=next.next;
        }

        curr.next=prev;
        
        return curr;
    }
}