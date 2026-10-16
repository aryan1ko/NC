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
    public boolean hasCycle(ListNode head) {
        Map<ListNode, Integer> map = new HashMap<>();
        ListNode curr = head;
        int i = 0;

        while(curr != null) {
            if(map.containsKey(curr)) {
                return true;
            }
            map.put(curr, 0);
            curr = curr.next;
        }
        return false;
    }
}
