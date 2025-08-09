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

class CovertArrayToDLL {
    public ListNode arrayToLinkedList(int [] nums) {

        // If array is empty
        if (nums.length == 0) return null;

        // Create head node with first element of the array
        ListNode head = new ListNode(nums[0]);

        // Initialize 'prev' to the head node
        ListNode prevNode = head;

        // Behind headNode there's always null
        prevNode.prev = null;


        for (int i = 1; i < nums.length; i++) {

            // Create a new node
            ListNode temp = new ListNode(nums[i], null, prevNode);

            // Update 'next' pointer
            prevNode.next = temp;

            // Move 'prev' to newly created node
            prevNode = temp;
        }

        // Tail points to null
        prevNode.next = null;

        // Return head
        return head;
    }
}