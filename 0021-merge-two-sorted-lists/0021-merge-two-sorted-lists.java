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
        ListNode current1 = list1;
        ListNode current2 = list2;
        ListNode res = new ListNode();
        ListNode tail = res;
        while (current1 != null && current2 != null) {
            if (current1.val == current2.val) {
                tail.next = current1;
                current1 = current1.next;
                tail = tail.next;
                tail.next = current2;
                current2 = current2.next;
            } else if (current1.val < current2.val) {
                tail.next = current1;
                current1 = current1.next;
            } else {
                tail.next = current2;
                current2 = current2.next;
            }
            tail = tail.next;
        }
        if (current1 != null) tail.next = current1;
        if (current2 != null) tail.next = current2;
        return res.next;
    }
}