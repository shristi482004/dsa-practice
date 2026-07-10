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
    public int findlength(ListNode head)
    {
        int len=0;
        ListNode temp=head;
        while(temp!=null)
        {
            len++;
            temp=temp.next;
        }
        return len;

    }
    public int findval(ListNode head,int k)
    {
        int idx=0;
        ListNode temp=head;
        while(temp!=null)
        {
            idx++;
            if(idx==k)
            {
                return temp.val;
            }
            temp=temp.next;
        }
        return -1;

    }
    public ListNode swapNodes(ListNode head, int k) {
        int length=findlength(head);
        // int a=findval(head,k);
        // int b=findval(head,length-k+1);
        //  ListNode fast=head;
        //  ListNode slow=head;
        // int i=0;
         int idx=0;
        // for(int j=1;j<k;j++)
        // {
        //     i++;
        //     fast=fast.next;
        // }
        // int a=fast.val;
        // fast=fast.next;
        // while(fast!=null)
        // {
        //     slow=slow.next;
        //     fast=fast.next;
        //     i++;
        // }
        // System.out.println(i+" "+k);
        // int b=slow.val;
        //  ListNode temp=head;
        //  System.out.println(a+" "+b);
        // while(temp!=null)
        // {
        //     idx++;
        //     if(idx==k)
        //     {
        //         temp.val=b;
        //     }
        //     else if(idx==length-k+1)
        //     {
        //         temp.val=a;
        //     }
        //     temp=temp.next;
        // }
        // return head;





    ListNode fast=head;
    ListNode slow=head;
    ListNode el1=null;
    int a=-1;
    int b=-1;
    for(int i=1;i<=k;i++)
    {
        if(i==k)
        {
            a=fast.val;
            el1=fast;
        }
        
        fast=fast.next;
    }
    while(fast!=null)
    {
        slow=slow.next;
        fast=fast.next;
    }
    b=slow.val;
    slow.val=a;
    el1.val=b;
    System.out.println(a+" "+b);
    return head;
    }
}