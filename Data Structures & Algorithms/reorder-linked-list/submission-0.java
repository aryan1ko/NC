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
        int maxIndex = 0;
        ListNode curr = head;
        Map<Integer, ListNode> map = new HashMap<>();

        while(curr != null) {
            map.put(maxIndex, curr);
            maxIndex++;
            curr = curr.next;
        }
        maxIndex--;

        int j = 0;
        int k = maxIndex;

        while(j <= k/2) {
            map.get(j).next = map.get(k);
            j++;
            if(j != k) {
                map.get(k).next = map.get(j);
            }
            k--;
        }

        if(maxIndex % 2 == 0) {
            map.get(maxIndex/2).next = null;
        }
        else {
            map.get(maxIndex/2 + 1).next = null;
        }
    }
}
