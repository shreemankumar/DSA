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
    public ListNode middleNode_(ListNode head){
        ListNode slow=head;
        ListNode fast=head;

        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast=fast.next.next;

        }
        return slow;
    }
    public ListNode reverseList_(ListNode head){
        ListNode prev =null;
        ListNode curr=head;

        while(curr!=null){
            ListNode nextOfCurr = curr.next;// save 
            curr.next=prev;
        // reverse the pointer
            prev=curr;
            curr=nextOfCurr;


        }
            head=prev;// head iss now at prev

        return head;
    }

    public ListNode mergeList_(ListNode head1, ListNode head2){
        ListNode dummy=new ListNode(-1);
        ListNode p1=head1;
        ListNode p2=head2;
        ListNode curr=dummy;
        while(p1!= null && p2!= null){
            ListNode nextOfp1=p1.next;
            p1.next=null;

            ListNode nextOfp2=p2.next;
            p2.next=null;
           
            
            curr.next =p1;
             p1=nextOfp1;
             curr=curr.next;


             curr.next=p2;
             p2=nextOfp2;
             curr=curr.next;
        }
        if(p1==null){
            curr.next=p2;
        }
        if(p2==null){
            curr.next=p1;
        }
        return dummy.next;

    }
    public ListNode reorderList(ListNode head) {
        // find mid
        ListNode mid=middleNode_(head);// save 


         //break into two list
        ListNode head2=mid.next;
        mid.next=null;

        //reverse the second list
        head2=reverseList_(head2);
        //merge two lists
        head=mergeList_(head,head2);
        return head;
    }
}