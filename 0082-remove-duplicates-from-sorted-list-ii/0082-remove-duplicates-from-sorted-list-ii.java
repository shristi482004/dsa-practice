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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null)
        return head;

        ListNode dummy=new ListNode(-1);
        ListNode temp=head;
        ListNode ans=dummy;
        if(temp.next.val!=temp.val)
        {
            ans.next=temp;
            ans=ans.next;
        }
   
        ListNode prev=head;
        temp=temp.next;
        while(temp!=null)
        {
            if(temp.next!=null)
            {
                if(temp.val!=prev.val && temp.val!=temp.next.val)
                {
                    ans.next=temp;
                    ans=ans.next;
                }
            }
            else if(temp.next==null)
            {
               if(temp.val!=prev.val)
                {
                    ans.next=temp;
                    ans=ans.next;
                } 
            }
            prev=temp;
            temp=temp.next;
         }
        ans.next=null;

        return dummy.next;
    }
}