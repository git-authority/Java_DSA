
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

class RemoveNthNodeFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode fastp = head;
        ListNode slowp = head;

        // Set the fast pointer
        for(int i = 0;i<n;i++){
            fastp = fastp.next;
        }

        if(fastp == null){
            return head.next;
        }

        while(fastp.next!=null){
            fastp = fastp.next;
            slowp=slowp.next;
        }

        ListNode delNode = slowp.next;
        slowp.next = slowp.next.next;
        return head;
    }
}