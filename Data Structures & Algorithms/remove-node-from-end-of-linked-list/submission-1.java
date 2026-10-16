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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        if(head.next == null) {
            return null;
        }

        ListNode first = head;
        ListNode dummy = new ListNode();
        dummy.next = head;

        for(int i = 0; i < n; i++) {
            first = first.next;
        }

        while(first != null) {
            dummy = dummy.next;
            first = first.next;
        }

        ListNode temp = dummy.next;
        dummy.next = temp.next;
        temp.next = null;

        return head;

    }
}

