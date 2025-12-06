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

public class RotateLL {
    public ListNode rotateRight(ListNode head, int k) {


        if(head == null || k == 0){
            return head;
        }


        int length = lengthOfLL(head);

        // Handles edge case if k>length of LL
        int updatedK = k%length;

        ListNode kThNode = null;

        kThNode = getKthNode(head, updatedK, length);

        if(kThNode!=null){
            // Stores the Tail of the original LL
            ListNode prevNode = getTail(head);

            // Stores Tail of to be formed LL
            ListNode temp2 = getNewTail(head, updatedK, length);

            ListNode temp = head;

            prevNode.next = temp;


            // Updated head
            head = kThNode;
            // Make the next pointer of to be formed LL Tail as null
            temp2.next = null;
        }


        return head;

    }

    private int lengthOfLL(ListNode head){
        ListNode current = head;
        int count = 0;
        while(current!=null){
            count++;
            current = current.next;
        }

        return count;
    }

    private ListNode getKthNode(ListNode head, int updatedK, int length){
        ListNode current = head;

        while(current!=null){

            if(length == updatedK){
                break;
            }

            length--;

            current = current.next;
        }

        return current;
    }

    private ListNode getNewTail(ListNode head, int updatedK, int length){
        ListNode current = head;

        while(current!=null){

            if(length == (updatedK+1)){
                break;
            }

            length--;

            current = current.next;
        }

        return current;
    }

    private ListNode getTail(ListNode head){
        ListNode current = head;

        while(current.next!=null){
            current = current.next;
        }

        return current;
    }
}