
public class InsertNodeBeforeHead {

    public ListNode insertBeforeHead(ListNode head, int X) {

        // Create New Head and update pointers
        ListNode newHead = new ListNode(X);
        newHead.prev = null;
        newHead.next = head;

        // Update pointers of earlier head
        head.prev = newHead;

        return newHead;
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
