
public class InsertNodeBeforeKthNode {

    public ListNode insertBeforeKthPosition(ListNode head, int X, int K) {

        // Creating the node to be inserted
        ListNode newNode = new ListNode(X);

        // If head is the only node in the linkedlist
        if (K == 1) {

            // Update pointers for newNode
            newNode.prev = null;
            newNode.next = head;

            // Update pointers for head
            head.prev = newNode;

            return newNode;
        }

        // Counter to count nodes
        int c = 0;

        // Pointer for traversing nodes
        ListNode counterNode = head;

        while (counterNode != null) {

            c++;

            if (c == K) {
                break;
            }

            counterNode = counterNode.next;

        }

        // Node before target node
        ListNode nodeBeforeTarget = counterNode.prev;

        // Update pointers for nodeBeforeTarget
        nodeBeforeTarget.next = newNode;

        // Insert the node before tail and update pointers
        newNode.prev = nodeBeforeTarget;
        newNode.next = counterNode;

        // Update pointers for tail node
        counterNode.prev = newNode;

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
