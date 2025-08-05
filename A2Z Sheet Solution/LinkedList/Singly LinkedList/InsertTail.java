
class ListNode {

    int val;
    ListNode next;

    ListNode(int data1) {
        val = data1;
        next = null;
    }
}

public class InsertTail {

    public ListNode insertAtTail(ListNode head, int X) {
        if (head == null) {
            return new ListNode(X);
        }

        ListNode temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = new ListNode(X);

        return head;

    }
}
