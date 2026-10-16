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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0) {
            return null;
        }
        for(int i = 1; i < lists.length; i++) {
            lists[i] = mergeTwoLists(lists[i], lists[i-1]);
        }
        return lists[lists.length - 1];
    }

    // merge 2 linked lists and return head of merged list
    // store the head in lists[i];
    public ListNode mergeTwoLists(ListNode head1, ListNode head2) {
        ListNode dummy = new ListNode();
        ListNode curr = dummy;
        ListNode l1 = head1;
        ListNode l2 = head2;

        while(l1 != null && l2 != null) {
            if(l1.val <= l2.val) {
                curr.next = l1;
                l1 = l1.next;
                curr = curr.next;
            }
            else {
                curr.next = l2;
                l2 = l2.next;
                curr = curr.next;
            }
        }

        if(l1 == null) {
            curr.next = l2;
        }
        else {
            curr.next = l1;
        }

        return dummy.next;
    }
}
