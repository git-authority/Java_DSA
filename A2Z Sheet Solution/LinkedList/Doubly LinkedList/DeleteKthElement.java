
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

class DeleteKthElement {
    public ListNode deleteKthElement(ListNode head, int k) {

        // If the list is empty
        if (head == null)
            return null;

        int count = 0;
        ListNode kthNode = head;


        while (kthNode != null) {

            count++;

            if (count == k) break;

            kthNode = kthNode.next;
        }

        // Pointers to identify the previous and next node to the kthNode
        ListNode prevNode = kthNode.prev;
        ListNode nextNode = kthNode.next;


        // If node to be deleted is the only node in the list
        if (prevNode == null && nextNode == null) {
            return null;
        }

        // If node to be deleted is head of the list
        else if (prevNode == null) {
            head = nextNode;
            nextNode.prev = null;
        }

        // If node to be deleted is tail of the list
        else if (nextNode == null) {
            prevNode.next = null;
        }

        // If node to be deleted is in the middle of the list
        else {
            prevNode.next = nextNode;
            nextNode.prev = prevNode;
        }

        // Return modified list head
        return head;
    }

}
