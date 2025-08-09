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

public class DeleteKthVal {
    public void deleteGivenNode(ListNode node) {

        ListNode prevNode = node.prev;
        ListNode nextNode = node.next;

        // If the given node is the tail node
        if (nextNode == null) {
            prevNode.next = null;
            return;
        }

        // Disconnect node
        prevNode.next = nextNode;
        nextNode.prev = prevNode;

        // Set node's pointers to null
        node.next = null;
        node.prev = null;
    }
}
