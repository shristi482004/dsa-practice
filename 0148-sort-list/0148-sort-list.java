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
    public ListNode findmiddle(ListNode head)
    {
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public ListNode merge(ListNode l1,ListNode l2)
    {
        ListNode dummy=new ListNode(0);
        ListNode temp=dummy;
        ListNode first=l1;
        ListNode second=l2;
        while(first!=null && second!=null)
        {
            if(first.val<=second.val)
            {
                temp.next=first;
                first=first.next;
            }
            else
            {
                temp.next=second;
                second=second.next; 
            }
            temp=temp.next;
        }
        while(first!=null)
        {
        temp.next=first;
        first=first.next; 
        temp=temp.next;
        }
        while(second!=null)
        {
        temp.next=second;
        second=second.next; 
        temp=temp.next;
        }
        return dummy.next;
    }
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null)
        return head;
        ListNode middle=findmiddle(head);
        ListNode right=middle.next;
        middle.next=null;
        ListNode left=head;

        left=sortList(left);
        right=sortList(right);
        return merge(left,right);
    }
}