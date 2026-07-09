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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy=new ListNode(0);
        ListNode temp=dummy;
        ListNode first=list1;
        ListNode second=list2;
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
}