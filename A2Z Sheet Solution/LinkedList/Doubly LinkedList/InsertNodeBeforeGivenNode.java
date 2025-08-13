public class InsertNodeBeforeGivenNode {
    /* Function to insert a new node before
    given node in a doubly linked list */
    public void insertBeforeGivenNode(ListNode node, int X) {
        // Get node before the given node
        ListNode prev = node.prev;

        // Create new node
        ListNode newNode = new ListNode(X, node, prev);

        // Connect newNode
        prev.next = newNode;
        node.prev = newNode;

        // void function to just update
        return;
    }
}
