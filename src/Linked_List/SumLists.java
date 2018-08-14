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
 * FOLLOW UP
 * Suppose the digits are stored in forward order. Repeat the above problem.
 * EXAMPLE
 * lnput:(6 -> 1 -> 7) + (2 -> 9 -> 5).That is,617 + 295.
 * Output: 9 - > 1 -> 2. That is, 912.
 */
public class SumLists {

    // Idea: Decimal addition
    private void sumByReversedOrder(ListNode head1, ListNode head2) {
        List<ListNode> nodes = new ArrayList<>();
        while (head1 != null && head2 != null) {
            List<Object> temp = this.decimalSum(this.getNodeValue(head1), this.getNodeValue(head2));
            ListNode node = new ListNode((int) temp.get(0));
            nodes.add(node);
            head1 = head1.next;
            head2 = head2.next;
        }
    }

    private void sumByForwardOrder(ListNode head1, ListNode head2) {

    }

    private List<Object> decimalSum(int val1, int val2) {
        List<Object> res = new ArrayList<>();
        int sum = val1 + val2;
        if (sum > 10) {
            res.add(sum - 10);
            res.add(true);
        } else {
            res.add(sum);
            res.add(false);
        }
        return res;
    }

    private int getNodeValue(ListNode node) {
        if (node == null) return 0;
        return node.val;
    }


    public static void main(String[] argv)
    {

    }
}
