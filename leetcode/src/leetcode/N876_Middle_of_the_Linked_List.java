package leetcode;

public class N876_Middle_of_the_Linked_List {
    public ListNode middleNode(ListNode head) {
        int middle = size(head) / 2;
        while (middle-- > 0) {
            head = head.next;
        }
        return head;
    }
    public int size(ListNode head) {
        if (head == null) return 0;
        int count = 1;
        return count += size(head.next);
    }
}
// https://leetcode.com/problems/middle-of-the-linked-list/