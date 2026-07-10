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
    public ListNode reverse(ListNode head)
    {
        if(head==null || head.next==null)
        return head;
        ListNode newnode=reverse(head.next);
        ListNode front=head.next;
        front.next=head;
        head.next=null;
        return newnode;
    }
    public ListNode doubleIt(ListNode head) {
        ListNode newhead=reverse(head);
        ListNode temp=newhead;
        int carry=0;
        while(temp!=null)
        {
            temp.val=(temp.val*2+carry);
            carry=temp.val/10;
            temp.val=temp.val%10;
            temp=temp.next;
        }
        ListNode ans=reverse(newhead);
        while(carry!=0)
        {
           ListNode newnode=new ListNode(carry);
           newnode.next=ans;
           ans=newnode;
           carry=carry/10; 
        }
        return ans;
    }
}