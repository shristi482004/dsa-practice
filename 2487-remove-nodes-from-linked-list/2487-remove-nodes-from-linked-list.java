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
    public ListNode reverse(ListNode head) {
        if(head==null || head.next==null)
        {
            return head;
        }
        ListNode newhead=reverse(head.next);
        ListNode front=head.next;
        front.next=head;
        head.next=null;
        return newhead;
    }
    public ListNode removeNodes(ListNode head) {
        ListNode newhead=reverse(head);
        ListNode temp=newhead;
        ListNode dummy=new ListNode(0);
        ListNode ans=dummy;
        int maxsofar=0;
        while(temp!=null)
        {
            if(temp.val>=maxsofar)
            {
                maxsofar=temp.val;
                System.out.println(maxsofar);
                ans.next=temp;
                ans=ans.next;
            }
            temp=temp.next;
        }
        ans.next=null;
        return reverse(dummy.next);
    }
}