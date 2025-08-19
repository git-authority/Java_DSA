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

class AddOne {
    public ListNode addOne(ListNode head) {
        // Check if the node next to head is 9, so we need to add a new node

        // If there are no nodes
        if(head == null){
            return null;
        }

        // Reverse LL
        head = reverseLL(head);

        // Node to track the current node in the linkedlist
        ListNode current = head;

        int carry = 1;

        while(current!=null){
            if(current.val<=8){
                current.val+=carry;
                carry = 0;
                break;
            }
            else{
                current.val = 0;
                carry = 1;
            }

            current = current.next;
        }


        head = reverseLL(head);

        // Extra node to store the carry over, if occurs
        if(carry == 1){
            ListNode newNode = new ListNode(carry);
            newNode.next = head;
            head = newNode;
        }


        return head;
    }

    private ListNode reverseLL(ListNode head){
        ListNode current = head;
        ListNode prev = null;

        while(current!=null){
            ListNode nextNode = current.next;

            current.next = prev;

            prev = current;

            current = nextNode;
        }

        return prev;

    }
}