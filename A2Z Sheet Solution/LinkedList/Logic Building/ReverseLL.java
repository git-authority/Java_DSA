public class ReverseLL {

    public ListNode reverseList(ListNode head) {

        // Pointer to traverse the original list
        ListNode current = head;

        // Pointer to keep track of the reversed linked list (initially empty)
        ListNode reversedLL = null;

        // Traverse until we reach the end of the original list
        while (current != null) {

            // Save the next node (so we don’t lose the rest of the list)
            ListNode nextNode = current.next;

            // The next node of the current node is the already formed reversedLL
            current.next = reversedLL;

            // reversedLL points to the head of the reversed linked list
            reversedLL = current;

            // Continue traversing original list
            current = nextNode;
        }


        return reversedLL;
    }
}
