public class IntersectionPoint {
    // Function to find the intersection node of two linked lists
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // Edge case
        if (headA == null || headB == null) return null;

        // Initialize two pointers to traverse the lists
        ListNode d1 = headA;
        ListNode d2 = headB;

        // Traverse both lists until the pointers meet
        while (d1 != d2) {
            // Move both the pointers by one place
            d1 = d1.next;
            d2 = d2.next;

            // If intersection is found
            if (d1 == d2) return d1;

            // If either of the two pointers reaches end, place at the front of next linked list
            if (d1 == null) d1 = headB;
            if (d2 == null) d2 = headA;
        }

        // Return the intersection node
        return d1;
    }
}