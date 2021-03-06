package Linked_List;

import java.util.ArrayList;
import java.util.List;

/**
 * Sum Lists: You have two numbers represented by a linked list, where each node contains a single
 * digit. The digits are stored in reverse order, such that the 1 's digit is at the head of the list. Write a
 * function that adds the two numbers and returns the sum as a linked list.
 * EXAMPLE
 * Input: (7-> 1 -> 6) + (5 -> 9 -> 2).That is,617 + 295.
 * Output: 2 -> 1 -> 9. That is, 912.
 * <p>
 * <p>
 * <p>
 * FOLLOW UP
 * Suppose the digits are stored in forward order. Repeat the above problem.
 * EXAMPLE
 * lnput:(6 -> 1 -> 7) + (2 -> 9 -> 5).That is,617 + 295.
 * Output: 9 - > 1 -> 2. That is, 912.
 * <p>
 * <p>
 * Test:
 * [2. Add Two Numbers] https://leetcode.com/problems/add-two-numbers/description/
 * [445. Add Two Numbers II] https://leetcode.com/problems/add-two-numbers-ii/description/
 */
public class SumLists {

    // Idea: Decimal addition
    private ListNode sumByReversedOrder(ListNode head1, ListNode head2) {

        boolean carryFlag = false;
        int sum = 0;
        List<ListNode> newLists = new ArrayList<>();
        while (head1 != null || head2 != null) {
            if (!carryFlag) sum = this.getNodeValue(head1) + this.getNodeValue(head2);
            else sum = this.getNodeValue(head1) + this.getNodeValue(head2) + 1;

            if (sum >= 10) {
                newLists.add(new ListNode(sum - 10));
                carryFlag = true;
            } else {
                newLists.add(new ListNode(sum));
                carryFlag = false;
            }

            if (head1 != null)
                head1 = head1.next;
            if (head2 != null)
                head2 = head2.next;
        }
        if (sum >= 10) {
            newLists.add(new ListNode(1));
        }

        for (int i = 0; i < newLists.size() - 1; i++) {
            newLists.get(i).next = newLists.get(i + 1);
        }
        return newLists.get(0);
    }

    private ListNode sumByForwardOrder(ListNode head1, ListNode head2) {
        // idea: Reverse the linked list and then do the reversed linked list sum
        ListNode header1 = this.getReverseLinkedList(head1);
        ListNode header2 = this.getReverseLinkedList(head2);

        return this.getReverseLinkedList(this.sumByReversedOrder(header1, header2));

    }

    /**
     * Here is another question about linked list (Reverse Linked List)
     * https://leetcode.com/problems/reverse-linked-list/description/
     *
     * @param head
     */
    private ListNode getReverseLinkedList(ListNode head) {
        // idea: for 1 loop and 2 pointers
        ListNode slower = null;
        ListNode runner = head;
        ListNode temp;
        while (runner != null) {
            temp = runner.next;
            //slower.next = null;
            runner.next = slower;
            slower = runner;
            runner = temp;
        }
        return slower;
    }

    private int getNodeValue(ListNode node) {
        if (node == null) return 0;
        return node.val;
    }


    public static void main(String[] argv) {
        // Test (6 -> 1 -> 7) + (2 -> 9 -> 5).That is, 617 + 295.
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(8);
        ListNode node3 = new ListNode(6);
        node1.next = node2;
        node2.next = node3;

        ListNode node4 = new ListNode(0);
        ListNode node5 = new ListNode(9);
        ListNode node6 = new ListNode(2);
//        node4.next = node5;
//        node5.next = node6;

        SumLists s = new SumLists();
        new Display_LinkedList(node1);
        System.out.println(" ");
        new Display_LinkedList(s.getReverseLinkedList(node1));


    }
}
