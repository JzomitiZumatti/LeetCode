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
    public int getDecimalValue(ListNode head) {
        StringBuilder stringBuilder = new StringBuilder();
        ListNode current = head;
        while (current != null) {
            stringBuilder.append(current.val);
            current = current.next;
        }
        return Integer.parseInt(stringBuilder.toString(), 2);
    }
}