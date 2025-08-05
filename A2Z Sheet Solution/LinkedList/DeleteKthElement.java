class ListNode {
    int val;
    ListNode next;

    ListNode(int data1) {
        val = data1;
        next = null;
    }

}

class DeleteKthElement {
    public ListNode deleteKthNode(ListNode head, int k) {
        if(head==null)  return null;

        if(k==1){
            return head.next;
        }

        ListNode temp = head;
        ListNode prev = null;
        int c = 0;

        while(temp!=null){
            c++;

            if(c==k){
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }

        return head;
    }
}