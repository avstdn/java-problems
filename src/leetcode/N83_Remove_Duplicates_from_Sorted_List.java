package leetcode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 *
 * Given a sorted linked list, delete all duplicates such that each element appear only once.
 *
 * Example 1:
 * Input: 1->1->2
 * Output: 1->2
 *
 * Example 2:
 * Input: 1->1->2->3->3
 * Output: 1->2->3
 */

public class N83_Remove_Duplicates_from_Sorted_List {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;

        ListNode newHead = new ListNode(head.val);
        ListNode currentNode = newHead;
        ListNode nextNode = head.next;

        while (nextNode != null) {
            if (currentNode.val != nextNode.val) {
                currentNode.next = new ListNode(nextNode.val);
                currentNode = currentNode.next;
            }

            nextNode = nextNode.next;
        }

        return newHead;
    }

    public ListNode deleteDuplicatesDiscuss(ListNode head) {
        ListNode currentNode = head;

        while (currentNode != null && currentNode.next != null) {
            if (currentNode.next.val == currentNode.val) {
                currentNode.next = currentNode.next.next;
            } else {
                currentNode = currentNode.next;
            }
        }

        return head;
    }
}
// https://leetcode.com/problems/remove-duplicates-from-sorted-list/