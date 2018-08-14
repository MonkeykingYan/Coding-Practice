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
 *
 *
 *
 * FOLLOW UP
 * Suppose the digits are stored in forward order. Repeat the above problem.
 * EXAMPLE
 * lnput:(6 -> 1 -> 7) + (2 -> 9 -> 5).That is,617 + 295.
 * Output: 9 - > 1 -> 2. That is, 912.
 *
 *
 * Test:
 * [2. Add Two Numbers] https://leetcode.com/problems/add-two-numbers/description/
 * [445. Add Two Numbers II] https://leetcode.com/problems/add-two-numbers-ii/description/
 */
public class _SumLists {

    // Idea: Decimal addition
    private ListNode sumByReversedOrder(ListNode head1, ListNode head2) {
        ListNode sumNode = null;
        boolean carryFlag = false;
        int sum;
        List<ListNode> newLists = new ArrayList<>();
        while (head1 != null & head2 != null) {
            if (carryFlag) sum = this.getNodeValue(head1) + this.getNodeValue(head2);
            else sum = this.getNodeValue(head1) + this.getNodeValue(head2) + 1;

            if (sum > 10) {
                sumNode = new ListNode(sum - 10);
                carryFlag = true;
            } else {
                sumNode = new ListNode(sum);
            }


            head1 = head1.next;
            head2 = head2.next;
            newLists.add(sumNode);
        }

        for (int i = 0; i < newLists.size() - 1; i++) {
            newLists.get(i).next = newLists.get(i + 1);
        }
        return newLists.get(0);
    }

    private void sumByForwardOrder(ListNode head1, ListNode head2) {

    }

    private int getNodeValue(ListNode node) {
        if (node == null) return 0;
        return node.val;
    }


    public static void main(String[] argv) {
        // Test (6 -> 1 -> 7) + (2 -> 9 -> 5).That is, 617 + 295.
        ListNode node1 = new ListNode(6);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(7);
        node1.next = node2;
        //node2.next = node3;

        ListNode node4 = new ListNode(2);
        ListNode node5 = new ListNode(9);
        ListNode node6 = new ListNode(5);
        node4.next = node5;
        node5.next = node6;

        new Display_LinkedList(node1);
        System.out.println("  ");
        new Display_LinkedList(node4);

        _SumLists sum = new _SumLists();
        System.out.println("  ");
        new Display_LinkedList(sum.sumByReversedOrder(node1, node4));

    }
}
