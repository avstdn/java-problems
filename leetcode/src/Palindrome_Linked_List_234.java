/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

public class Palindrome_Linked_List_234 {
        public boolean isPalindrome(ListNode head) {
            ArrayDeque deque = new ArrayDeque();
            ListNode newHead = head;
            while (newHead != null) {
                deque.push(newHead.val);
                newHead = newHead.next;
            }
            while (!deque.isEmpty() && head != null) {
                if (head.val != (int)deque.pop()) return false;
                head = head.next;
            }
            return true;
        }
    }
// https://leetcode.com/problems/palindrome-linked-list/