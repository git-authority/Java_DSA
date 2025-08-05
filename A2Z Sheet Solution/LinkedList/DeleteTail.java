

class ListNode {
    int val;
    ListNode next;

    ListNode(int data1) {
        val = data1;
        next = null;
    }
}

public class DeleteTail {
    public ListNode deleteTail(ListNode head) {
        if(head == null || head.next==null) return null;

        ListNode temp = head;

        while(temp.next.next != null){
            temp = temp.next;
        }

        temp.next = null;
        return head;
    }
}
