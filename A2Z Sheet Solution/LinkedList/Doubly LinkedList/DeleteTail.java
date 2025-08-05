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

class DeleteTail {
    public ListNode deleteTail(ListNode head) {

        // If <=1 node
        if(head == null || head.next == null)
            return null;

        // If more than 1 node
        ListNode tail = head;

        while(tail.next!=null){
            tail = tail.next;
        }

        ListNode newTail = tail.prev;
        newTail.next = null;

        tail.prev = null;

        return head;
    }
}