package leetcode;

/**
 * Reverse a singly linked list.
 *
 * Example:
 * Input: 1->2->3->4->5->NULL
 * Output: 5->4->3->2->1->NULL
 *
 * Follow up:
 * A linked list can be reversed either iteratively or recursively. Could you
 * implement both?
 *
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class N206_Reverse_Linked_List {
    public ListNode reverseListIterative(ListNode head) {
        ListNode currentNode = head;
        ListNode previousNode = null;
        ListNode nextNode = null;

        while (currentNode != null) {
            nextNode = currentNode.next;
            currentNode.next = previousNode;
            previousNode = currentNode;
            currentNode = nextNode;
        }

        return previousNode;
    }

     public ListNode reverseListRecurcive(ListNode head) {
         if (head == null || head.next == null) return head;

         ListNode newHead = reverseListRecurcive(head.next);
         head.next.next = head;
         head.next = null;

         return newHead;
     }
}
// https://leetcode.com/problems/reverse-linked-list/solution/