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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode current = head;
        while (current.next != null) {
            int a = current.val;
            int b = current.next.val;
            ListNode newNode = new ListNode(gCD(a, b));
            newNode.next = current.next;
            current.next = newNode;
            current = current.next.next;
        }
        return head;
    }

    private static int gCD(int a, int b) {
        int res = 1;
        int min = Math.min(a, b);
        for (int i = 1; i <= min; i++) {
            if (a % i == 0 && b % i == 0) res = Math.max(res, i);
        }
        return res;
    }
}