/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {

    public ListNode detectCycle(ListNode head) {

        ListNode fast = head;
        ListNode slow = head;

        // STEP 1: Detect cycle
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {

                // STEP 2: Find length of cycle
                int length = cycleLength(slow);

                // STEP 3: Find start of cycle
                ListNode f = head;
                ListNode s = head;

                while (length > 0) {
                    s = s.next;
                    length--;
                }

                while (f != s) {
                    f = f.next;
                    s = s.next;
                }

                return f; // start of cycle
            }
        }
        return null; // no cycle
    }

    // helper method
    private int cycleLength(ListNode node) {
        int length = 0;
        ListNode temp = node;
        do {
            temp = temp.next;
            length++;
        } while (temp != node);
        return length;
    }
}
