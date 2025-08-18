/*
Definition for singly linked list:
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
*/

public class SegregateOddEven {
    public ListNode oddEvenList(ListNode head) {

        // If no nodes exist
        if(head == null){
            return head;
        }

        // Make the first node of the linkedlist as the head
        ListNode odd = head;

        // Make the second node as the head of the even value nodes
        ListNode even = head.next;

        // Temporary node to store the head of the even linkedlist
        ListNode evenHead = even;

        // Assign values to each LinkedList
        while(even!=null && even.next!=null){

            odd.next = odd.next.next;   // link odd to next odd
            odd = odd.next;             // move odd forward

            even.next = even.next.next; // link even to next even
            even = even.next;           // move even pointer
        }


        // Attach the linkedlist storing even values to the end of the linkedlist storing odd values
        odd.next = evenHead;

        // return head of the entire formed linkedlist after ignoring the dummyhead
        return head;

    }
}
