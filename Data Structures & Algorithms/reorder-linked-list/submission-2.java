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
    public void reorderList(ListNode head) {
        // fast and slow pointer to split list in half
        ListNode p1 = head;
        ListNode p2 = head.next;
        
        while(p2 != null && p2.next != null) {
            p1 = p1.next;
            p2 = p2.next.next;
        }
        



        ListNode curr = p1.next;
        p1.next = null;
        ListNode prev = null;
        while(curr != null) {
            ListNode nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }


        ListNode tail = prev;

        // combine the 2 lists
        ListNode dummy = head;
        
        while(tail != null) {
            ListNode tmp = dummy.next;
            ListNode tmp2 = tail.next;

            dummy.next = tail;
            tail.next = tmp;

            tail = tmp2;
            dummy = tmp;
        }



    }
}
