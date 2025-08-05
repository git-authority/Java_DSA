class ListNode {
    int val;
    ListNode next;

    ListNode(int data1) {
        val = data1;
        next = null;
    }
}

public class InsertBeforeTheValueX  {

    public ListNode insertBeforeX(ListNode head, int X, int val) {

        // If linkedlist is empty
        if (head == null) {
            return null;
        }

        // If element is to be placed just before head
        if (head.val == X) {
            ListNode newNode = new ListNode(val);
            newNode.next = head;
            return newNode;
        }

        // Otherwise, if element is to be placed before any other element
        ListNode temp = head;

        while (temp.next != null) {

            if (temp.next.val == X) {
                ListNode newNode = new ListNode(val);
                newNode.next = temp.next;
                temp.next = newNode;
                break;
            }

            // Move pointer forward
            temp = temp.next;
        }
        return head;
    }
}