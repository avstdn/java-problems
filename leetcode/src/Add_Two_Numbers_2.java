/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

public class Add_Two_Numbers_2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        long result = getNum(l1) + getNum(l2);
        System.out.println(getNum(l2));
        System.out.println(result);

        ListNode head = null;

        if (result == 0) head = insert(head, 0);
        else {
            while (result > 0) {
                head = insert(head, (int)(result % 10));
                result /= 10;
            }
        }

        return head;
    }

    public long getNum(ListNode li) {
        long mult = 1;
        long num = 0;

        while (li != null) {
            num += li.val * mult;
            li = li.next;
            mult *= 10;
        }

        return num;
    }

    public ListNode insert(ListNode head, int val) {
        ListNode p = new ListNode(val);

        if (head == null) head = p;
        else if (head.next == null) head.next = p;
        else {
            ListNode start = head;
            while (start.next != null) start = start.next;
            start.next = p;
        }

        return head;
    }
}
// https://leetcode.com/problems/add-two-numbers/