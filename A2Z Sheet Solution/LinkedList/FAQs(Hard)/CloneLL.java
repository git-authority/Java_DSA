
class ListNode {
    int val;
    ListNode next;
    ListNode random;
    ListNode() {
        val = 0;
        next = null;
        random = null;
    }
    ListNode(int data1) {
        val = data1;
        next = null;
        random = null;
    }
    ListNode(int data1, ListNode next1, ListNode r) {
        val = data1;
        next = next1;
        random = r;
    }
}

public class CloneLL {

    public ListNode copyRandomList(ListNode head) {

        if (head == null) return null;

        insertCopyInBetween(head);

        connectRandomPointers(head);

        return getDeepCopyList(head);
    }


    private void insertCopyInBetween(ListNode head) {
        ListNode temp = head;

        while (temp != null) {
            ListNode nextElement = temp.next;

            ListNode copy = new ListNode(temp.val);

            copy.next = nextElement;

            temp.next = copy;

            temp = nextElement;
        }
    }


    private void connectRandomPointers(ListNode head) {
        ListNode temp = head;
        while (temp != null) {

            ListNode copyNode = temp.next;


            if (temp.random != null) {
                copyNode.random = temp.random.next;
            } else {

                copyNode.random = null;
            }

            temp = temp.next.next;
        }
    }

    // Function to retrieve the deep copy of the linked list
    private ListNode getDeepCopyList(ListNode head) {
        ListNode temp = head;

        ListNode dummyNode = new ListNode(-1);
        ListNode res = dummyNode;

        while (temp != null) {

            res.next = temp.next;
            res = res.next;

            temp.next = temp.next.next;
            temp = temp.next;
        }

        return dummyNode.next;
    }


}