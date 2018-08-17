package Linked_List;

import java.util.HashMap;

/**
 * Loop Detection: Given a circular linked list, implement an algorithm that returns the node at the
 * beginning of the loop.
 * DEFINITION
 * Circular linked list: A (corrupt) linked list in which a node's next pointer points to an earlier node, so
 * as to make a loop in the linked list.
 * EXAMPLE
 * Input: A -> B -> C - > D -> E -> C [the same C as earlier]
 * Output: C
 */
public class LoopDetection {
    // idea: hashmap and find the node which appared twice
    public ListNode detectCycle(ListNode head) {
        HashMap<ListNode, Integer> map = new HashMap<>();
        while(head!=null)
        {
            map.put(head, map.getOrDefault(head,0)+1);
            if(map.get(head) == 2) return head;
            head = head.next;
        }
        return null;
    }

}
