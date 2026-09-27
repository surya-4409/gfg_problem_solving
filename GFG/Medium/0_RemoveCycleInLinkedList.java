/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/remove-loop-in-linked-list/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

class Solution {
    public static void removeLoop(Node head) {

        Node slow = head;
        Node fast = head;

        // Step 1: Detect cycle
        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                break;
            }
        }

        // No cycle
        if (slow != fast) {
            return;
        }

        // Step 2: Find starting point of cycle
        slow = head;

        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        // Step 3: Find last node in cycle
        while (fast.next != slow) {
            fast = fast.next;
        }

        // Step 4: Remove cycle
        fast.next = null;
    }
}
