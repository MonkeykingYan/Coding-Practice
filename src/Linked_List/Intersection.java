package Linked_List;

/**
 * Write a program to find the node at which the intersection of two singly linked lists begins.
 */
public class Intersection {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p1 = headA;
        ListNode p2 = headB;

        if (headA == null || headB == null) return null;

        int len1 = this.getLength(headA);
        int len2 = this.getLength(headB);

        int gap = Math.abs(len1 - len2);
        if (len1 >= len2) {
            return this.checkIntersectionFromNode(headA, headB, gap);
        } else {
            return this.checkIntersectionFromNode(headB, headA, gap);
        }
    }

    private int getLength(ListNode head) {
        int len = 0;
        while (head != null) {
            len++;
            head = head.next;
        }
        return len;
    }

    private ListNode checkIntersectionFromNode(ListNode headA, ListNode headB, int gap) {
        while (headA != null) {
            if (gap != 0) {
                if (headA == headB) return headA;
                headA = headA.next;
                gap--;
            } else {
                if (headA == headB) return headA;
                headA = headA.next;
                headB = headB.next;
            }
        }
        return null;
    }
}
