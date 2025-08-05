class ListNode {
    int val;
    ListNode next;
    ListNode prev;

    ListNode(int data1) {
        val = data1;
        next = null;
        prev = null;
    }
}

class DeleteHead {
    public ListNode deleteHead(ListNode head) {

        // If <= 1 node
        if(head == null || head.next == null)
            return null;

        // If more than 1 node
        ListNode previous = head;

        head = head.next;
        head.prev = null;

        previous.next = null;
        return head;

    }
}