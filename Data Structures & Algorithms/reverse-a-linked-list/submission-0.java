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
    public ListNode reverseList(ListNode head) {
        Stack<Integer> stack = new Stack();
        ListNode node = head;
        while (node != null) {
            stack.push(node.val);
            node = node.next;
        }
        ListNode returnListHead = null;
        ListNode returnListCurrentNode = null;
        while (!stack.isEmpty()) {
            if (returnListHead == null) {
                returnListHead = new ListNode(stack.pop());
                returnListCurrentNode = returnListHead;
            } else {
                returnListCurrentNode.next = new ListNode(stack.pop());
                returnListCurrentNode = returnListCurrentNode.next;
            }
        }
        return returnListHead;
    }
}
