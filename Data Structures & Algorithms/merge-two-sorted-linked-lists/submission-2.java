// /**
//  * Definition for singly-linked list.
//  * public class ListNode {
//  *     int val;
//  *     ListNode next;
//  *     ListNode() {}
//  *     ListNode(int val) { this.val = val; }
//  *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  * }
//  */

// class Solution {
//     public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//         ListNode l1 = list1;
//         ListNode l2 = list2;
//         if(l1.val < l2.val) {
//             ListNode head = list1;
//             ListNode curr = list1;
//         }
//         else if(l1.val == l2.val) {
//             // HANDLE EQUAL CASE
//             ListNode head = list1;
//             head.next = list2;
//         }
//         else {
//             ListNode head = list2;
//             ListNode curr = list2;
//         }

//         while(l1.next != null || l2.next != null) {
//             if(l1.next < l2.next) {
//                 curr.next = l1.next;
//                 l1 = l1.next;
//             }
//             else if (l1.next > l2.next) {
//                 curr.next = l2.next;
//                 l2 = l2.next;
//             }
//             else {
//                 // EQUAL CASE
//             }
//         }
//         if(l1.next == null) {
//             curr.next = l2.next;
//         }
//         else if(l2.next == null) {
//             curr.next = l1.next;
//         }

//         return head;
//     }
// }