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
        return head;
        ListNode newhead=reverse(head.next);
        ListNode front=head.next;
        front.next=head;
        head.next=null;
        return newhead;
    }
    public int pairSum(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode newhead=reverse(slow);
        ListNode first=head;
        ListNode second=newhead;
        int maxsum=0;
        while(first!=null)
        {
            maxsum=Math.max(maxsum,first.val+second.val);
            first=first.next;
            second=second.next;
        }
        return maxsum;
    }
}