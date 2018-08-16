package Linked_List;

import java.util.Stack;

/**
 * Given a singly linked list, determine if it is a palindrome.
 * <p>
 * Example 1:
 * <p>
 * Input: 1->2
 * Output: false
 * Example 2:
 * <p>
 * Input: 1->2->2->1
 * Output: true
 */
public class Palindrome {

    // Idea: stack
    public boolean isPalindrome(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        ListNode p1 = head;
        ListNode p2 = head;
        while (true) {
            if (p2 == null || p2.next == null) break;
            stack.push(p1);
            p1 = p1.next;
            p2 = p2.next.next;
        }
        if (p2 != null) {
            p1 = p1.next;
        }

        while (p1 != null) {
            ListNode popNode = stack.pop();
            if (p1.val == popNode.val) {
                p1 = p1.next;
            } else {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] argv) {
        //Test (1 -> 8 -> 6)
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(8);
        ListNode node3 = new ListNode(1);
//        ListNode node4 = new ListNode(1);
        node1.next = node2;
        node2.next = node3;
//        node3.next = node4;

        Palindrome p = new Palindrome();
        new Display_LinkedList(node1);
        System.out.println();
        System.out.println(p.isPalindrome(node1));


    }
}
