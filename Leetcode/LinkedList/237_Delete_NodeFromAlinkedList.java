/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        ListNode nextOfnode =node.next;
        node.val=nextOfnode.val;


        ListNode nextOfnextOfnode=nextOfnode.next;
       node.next= nextOfnextOfnode;
    }
}
