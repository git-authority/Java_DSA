class ListNode {
    int val;
    ListNode next;
    ListNode prev;

    ListNode() {
        val = 0;
        next = null;
        prev = null;
    }

    ListNode(int data1) {
        val = data1;
        next = null;
        prev = null;
    }

    ListNode(int data1, ListNode next1, ListNode prev1) {
        val = data1;
        next = next1;
        prev = prev1;
    }
}

class DeleteKeysInDLL {
    public ListNode deleteAllOccurrences(ListNode head, int target) {

        if (head == null){
            return null;
        }

        // Dummy exists only to fix the head-deletion case
        ListNode dummy = new ListNode(-1);

        dummy.next = head;
        head.prev = dummy;

        ListNode current = head;

        while(current!= null) {

            if (current.val == target){

                // Connect next pointers
                current.prev.next = current.next;

                // Connect previous pointers
                if(current.next!= null){
                    current.next.prev = current.prev;
                }

                ListNode nextNode = current.next;
                current.next = null;
                current.prev = null;
                current = nextNode;

            }
            else{
                current = current.next;
            }
        }


        head = dummy.next;

        if(head!= null){
            head.prev = null;
        }

        return head;
    }
}

