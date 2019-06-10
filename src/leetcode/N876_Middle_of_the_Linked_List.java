package leetcode;

public class N876_Middle_of_the_Linked_List {
//    public ListNode middleNode(ListNode head) {
//        int middle = size(head) / 2;
//        while (middle-- > 0) {
//            head = head.next;
//        }
//        return head;
//    }
//    public int size(ListNode head) {
//        if (head == null) return 0;
//        int count = 1;
//        return count += size(head.next);
//    }

    public ListNode middleNode(ListNode head) {
        int index = 0;
        ListNode middle = head;
        ListNode node = head;

        while (node != null) {
            if (++index > 1 && index % 2 == 0) middle = middle.next;
            node = node.next;
        }

        return middle;
    }
}
// https://leetcode.com/problems/middle-of-the-linked-list/