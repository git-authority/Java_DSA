class ListNode {
    int val;
    ListNode next;

    ListNode(int data1) {
        val = data1;
        next = null;
    }
}

public class DeleteElementWithValueX {
    public ListNode deleteNodeWithValueX(ListNode head, int X) {
        if(head == null)  return null;

        if(head.val==X){
            head = head.next;
            return head;
        }

        ListNode temp = head;
        ListNode prev = null;

        while(temp!=null){

            if(temp.val == X){
                prev.next = prev.next.next;
                break;
            }

            prev = temp;
            temp = temp.next;
        }

        return head;
    }
}