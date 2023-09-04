package org.example;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.example.Utils.ListNode;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    EasyProblems easyProblems = new EasyProblems();

    public void testMiddleNode_EvenNumberOfNodes_1() {
        // Create a sample linked list: 1 -> 2 -> 3 -> 4 -> 5 -> null
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        EasyProblems easyProblems = new EasyProblems();
        ListNode middleNode = easyProblems.middleNode(head);

        // The middle node should have value 3
        assertEquals(3, middleNode.val);
    }

    public void testMiddleNode_EvenNumberOfNodes_2() {
        // Create a sample linked list: 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> null
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);

        EasyProblems easyProblems = new EasyProblems();
        ListNode middleNode = easyProblems.middleNode(head);

        // The middle node should have value 4
        assertEquals(4, middleNode.val);
    }

    public void testMiddleNode_EvenNumberOfNodes_3() {
        // Create a sample linked list: 1 -> 2 -> 3 -> null
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);

        EasyProblems easyProblems = new EasyProblems();
        ListNode middleNode = easyProblems.middleNode(head);

        // The middle node should have value 2
        assertEquals(2, middleNode.val);
    }
}
