class ListNode {
    int val;
    ListNode next;

    ListNode() {
        val = 0;
        next = null;
    }

}

public class DeleteHead {
   public ListNode deleteHead(ListNode head) {

        if(head == null)    return null;

        head = head.next;

        return head;

    }
}