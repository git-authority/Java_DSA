
public class InsertNodeBeforeTail {

    public ListNode insertBeforeTail(ListNode head, int X) {

        // Creating the node to be inserted
        ListNode newNode = new ListNode(X);

        // If head is the only node in the linkedlist
        if (head.next == null) {

            // Update pointers for newNode
            newNode.prev = null;
            newNode.next = head;

            // Update pointers for head
            head.prev = newNode;

            return newNode;
        }

        ListNode tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }

        // Node before tail node
        ListNode nodeBeforeTail = tail.prev;

        // Update pointers for nodeBeforeTail
        nodeBeforeTail.next = newNode;

        // Insert the node before tail and update pointers
        newNode.prev = nodeBeforeTail;
        newNode.next = tail;

        // Update pointers for tail node
        tail.prev = newNode;

        return head;
    }
}

class ListNode {

    int val;
    ListNode next;
    ListNode prev;

    ListNode() {
        val = 0;
        next = null;
        prev = null;
    }

    ListNode(int data1) {
        val = data1;
        next = null;
        prev = null;
    }

    ListNode(int data1, ListNode next1, ListNode prev1) {
        val = data1;
        next = next1;
        prev = prev1;
    }
}
