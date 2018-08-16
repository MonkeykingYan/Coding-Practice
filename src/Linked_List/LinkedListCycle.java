package Linked_List;

/**
 * Given a linked list, determine if it has a cycle in it.
 * <p>
 * Follow up:
 * Can you solve it without using extra space?
 */
public class LinkedListCycle {
    //Ideas: 2 pointers, slower and faster
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) return false;
        boolean flag = false;
        ListNode slower = head;
        ListNode faster = head;
        while (faster != null && faster.next != null) {
            if (slower.val == faster.val && flag) return true;
            slower = slower.next;
            faster = faster.next.next;
            flag = true;
        }
        return false;
    }


    public static void main(String[] argv) {
        //Test
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(8);
        ListNode node3 = new ListNode(6);
        //node1.next = node2;
        // node2.next = node3;

        LinkedListCycle l = new LinkedListCycle();
        System.out.println(l.hasCycle(node1));
    }
}
