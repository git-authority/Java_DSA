class ListNode {
    int val;
    ListNode next;

    ListNode() {
        val = 0;
        next = null;
    }

    ListNode(int data1) {
        val = data1;
        next = null;
    }

    ListNode(int data1, ListNode next1) {
        val = data1;
        next = next1;
    }
}

public class DeleteMiddleNode {
    public ListNode deleteMiddle(ListNode head) {

        if(head.next == null){
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;
        ListNode temp = new ListNode();

        while(fast!=null && fast.next!=null){
            temp = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        temp.next = slow.next;
        slow.next = null;

        return head;
    }
}