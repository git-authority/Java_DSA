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
public class AddTwoNos {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        // Create a dummy node with a random value
        ListNode dummy = new ListNode();

        // Store the dummy node into a temporary variable
        ListNode temp = dummy;

        // Initialize carry
        int carry  = 0;

        // The loop will run only if the nodes are not null or carry is not 0
        while((l1!=null || l2!=null) || (carry != 0)){

            // Make sum as zero everytime before adding value of nodes
            int sum = 0;
            // if the node l1 is not null then add the value of it and update pointers
            if(l1!=null){
                sum+=l1.val;
                l1 = l1.next;
            }

            // if the node l2 is not null then add the value of it and update pointers
            if(l2!=null){
                sum+=l2.val;
                l2 = l2.next;
            }

            // Add the carry
            sum+=carry;

            // Update carry
            carry = sum/10;

            // Store the value of addition into a new node
            ListNode node = new ListNode(sum%10);

            // Update pointers
            temp.next = node;
            temp = temp.next;

        }

        return dummy.next;

    }
}