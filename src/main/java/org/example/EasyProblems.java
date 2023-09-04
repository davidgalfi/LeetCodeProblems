package org.example;

import org.example.Utils.ListNode;

public class EasyProblems {
    public ListNode middleNode(ListNode head) {
        /* Given a ListNode for instance:
        * value: 1 next: ListNode(2,ListNode(3,ListNode(4))).
        * We have [1,2,3,4].*/

        // Store the List's size
        byte size = 0;

        // Current node
        ListNode node = head;

        // Iterate through the list to find the size of the List
        while(node != null){
            size++;
            node = node.next;
        }

        // Reset the current node to the first node
        node = head;

        // Middle node's size
        int intmiddleNodeSize = (int) size / 2;

        // Iterate through the List for the middle node
        for(int i=0; i<intmiddleNodeSize; i++){
            node = node.next;
        }

        return node;
    }

    public ListNode middleNode_better_solution(ListNode head) {
        /* When we add two node, the middle node move one */

        ListNode middle = head;
        ListNode node = head;

        while(node != null && node.next!= null){
            middle = middle.next;
            node = node.next.next;
        }

        return middle;
    }
}
