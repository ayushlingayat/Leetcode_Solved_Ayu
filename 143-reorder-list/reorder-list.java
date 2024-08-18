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
    public void reorderList(ListNode head)
	{
		ListNode mid = getMiddle(head);		
		ListNode head2 = reverseList(mid.next);		
		mid.next = null;
		head = reorder(head,head2);
	}
	
	public ListNode getMiddle(ListNode head)
	{
		ListNode slow=head;
		ListNode fast = head;
		
		while(fast.next!=null && fast.next.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
		}
		
		return slow;
	}
	
	public ListNode reverseList(ListNode head)
	{
		ListNode prev=null;
		ListNode next = null;
		ListNode curr=head;
		
		while(curr!=null)
		{
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;			
		}
		
		head = prev;
		
		return head;
	}
	
	public ListNode reorder(ListNode head, ListNode head2)
	{
		ListNode p = head;
		
		while(p!=null && head2!=null)
		{
			ListNode t = p.next;
			ListNode t2 = head2.next;
			p.next = head2;
			head2.next = t;
			
			p= t;
			head2 = t2;
		}
		
		return head;
	}
}