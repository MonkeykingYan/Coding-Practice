package Linked_List;

/**
 * Implement an algorithm to delete a node in the middle (i.e., any node but
 * the first and last node, not necessarily the exact middle) of a singly linked list, given only access to
 * that node.
 * EXAMPLE
 * lnput:the node c from the linked list a->b->c->d->e->f
 * Result: nothing is returned, but the new linked list looks like a->b->d->e- >f
 */
public class DeleteMiddleNode {
    // Step1: The len of the node
    // Step2: delete the middle element

    private int getListLen(ListNode head) {
        int len = 0;
        while (head != null) {
            len++;
            head = head.next;
        }
        return len;
    }

    private void deleteKthElement(ListNode head, int index) {
        int i = 0;
        while (true) {
            if (i == index - 1) {
                head.next = head.next.next;
                break;
            }
            head = head.next;
            i++;
        }
    }


    private void deleteMiddle(ListNode head) {
        int middle = this.getListLen(head) / 2;
        if(middle == 0) return;
        System.out.println("mid:" + middle);
        this.deleteKthElement(head, middle);
    }

    public static void main(String[] argv) {
        // Test. 2->1->3->2
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(2);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        DeleteMiddleNode dmid = new DeleteMiddleNode();
        dmid.deleteMiddle(node1);
        new Display_LinkedList(node1);
    }

}
