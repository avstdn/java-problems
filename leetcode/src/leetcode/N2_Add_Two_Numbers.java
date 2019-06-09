package leetcode;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

public class N2_Add_Two_Numbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        boolean transition = false;
        ListNode head = null;

        while (l1 != null || l2 != null) {

            int first = l1 == null ? 0 : l1.val;
            int second = l2 == null ? 0 : l2.val;
            int sum = transition ? first + second + 1 : first + second;

            if (transition = sum > 9) sum %= 10;

            head = insertNode(head, sum);

            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
        }
        if (transition) head = insertNode(head, 1);

        return head;
    }

    public ListNode insertNode(ListNode head, int val) {
        ListNode node = new ListNode(val);

        if (head == null) head = node;
        else if (head.next == null) head.next = node;
        else {
            ListNode start = head;
            while(start.next != null) start = start.next;
            start.next = node;
        }

        return head;
    }
}
// https://leetcode.com/problems/add-two-numbers/