public class InsertAtK {

    public ListNode insertAtKthPosition(ListNode head, int X, int K) {

        // If linkedlist is empty
        if (head == null) {
            if (K == 1)
                return new ListNode(X);
            else
                return head;
        }

        // If element is to be inserted at the starting where head was
        if (K == 1) {
            ListNode newNode = new ListNode(X);
            newNode.next = head;
            return newNode;
        }

        // Otherwise
        int cnt = 1;
        ListNode temp = head;


        while (temp != null) {
            cnt++;

            if (cnt == K) {
                ListNode newNode = new ListNode(X);
                newNode.next = temp.next;
                temp.next = newNode;
                break;
            }

            // Move pointer to next node
            temp = temp.next;
        }

        return head;
    }
}