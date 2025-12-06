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

class ReverseKGroup {


    public ListNode reverseKGroup(ListNode head, int k) {

        ListNode current = head;

        // Used to store previous group's last node
        ListNode prevLast = null;


        while (current != null) {

            ListNode kThNode = getKthNode(current, k);

            // If the Kth node is NULL (when length of group is less than k)
            if (kThNode == null) {

                // If there was a previous group,
                // link the last node to the current node
                if (prevLast != null) {
                    prevLast.next = current;
                }

                break;
            }


            ListNode nextNode = kThNode.next;

            kThNode.next = null;

            reverseLinkedList(current);


            // Assign head of each group
            // 1. If it is the first group
            if (current == head) {
                head = kThNode;
            }
            // 2. If it is not the first group
            else
            {
                prevLast.next = kThNode;
            }

            prevLast = current;

            current = nextNode;
        }

        return head;
    }



    public ListNode getKthNode(ListNode current, int k) {

        k -= 1;

        while (current != null && k > 0) {
            k--;
            current = current.next;
        }

        return current;
    }



    public ListNode reverseLinkedList(ListNode head) {

        ListNode current = head;
        ListNode reversedLLHead = null;

        while (current != null) {

            ListNode nextNode = current.next;

            current.next = reversedLLHead;

            reversedLLHead = current;

            current = nextNode;
        }

        return reversedLLHead;
    }


}