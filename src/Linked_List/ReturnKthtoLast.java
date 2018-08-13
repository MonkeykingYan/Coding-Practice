package Linked_List;

// Implement an algorithm to find the kth to last element of a singly linked list
public class ReturnKthtoLast {

    private ListNode findKthtoLast(ListNode head, int k) {
        //1. we have to know the length of the linked list -> n
        //2. we need find the n-k -1 th node is the result

        // Step 1:
        int len = this.findLen(head);

        // Step 2:
        if (k > len) return null;
        int iterator = 0;
        while (iterator < (len - k -1) ) {
            head = head.next;
            iterator++;
        }

        return head;

    }

    private int findLen(ListNode head) {
        int len = 0;
        while (head != null) {
            len++;
            head = head.next;
        }
        return len;
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

        ReturnKthtoLast lol = new ReturnKthtoLast();
        ListNode res = lol.findKthtoLast(node1, 0);
        System.out.println("len: " + lol.findLen(node1));
        if(res!=null) System.out.println(res.val);
        else System.out.println(res);


    }

}
