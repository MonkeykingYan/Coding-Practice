package Linked_List;

/**
 * Remove Dups! Write code to remove duplicates from an unsorted linked list.
 * FOLLOW UP
 * How would you solve this problem if a temporary buffer is not allowed?
 */
public class RemoveDups {
    //2->1->3->2
    //2->1->3
    ListNode checker;
    ListNode follower;

    private void removeDups(ListNode head) {
        checker = head.next;
        follower = head;
        while (follower.next != null) {
            while (checker.next != null) {
                if (follower.val == checker.val) {
                    follower.next = follower.next.next;
                }
                checker = checker.next;
            }
            follower = follower.next;
        }
    }


    public static void main(String[] agv) {
        // Test.
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(2);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        RemoveDups rd = new RemoveDups();
        rd.removeDups(node1);

       ListNode node = node1;
        while(node.next!=null)
        {
            System.out.print("Node:" + node.val+"->");
            node = node.next;
        }

    }

}
