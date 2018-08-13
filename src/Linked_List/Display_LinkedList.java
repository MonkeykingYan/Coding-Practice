package Linked_List;

public class Display_LinkedList {
    public Display_LinkedList(ListNode head) {
        while (head != null) {
            System.out.print("Node" + head.val + "-> ");
            head = head.next;
        }
    }
}
