public class LengthOfLoop {

    public int findLengthOfLoop(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;

            fast = fast.next.next;

            if (slow == fast) {

                return countLoopLength(slow);
            }
        }

        return 0;
    }

    // Helper Function to count the length of the loop
    private int countLoopLength(ListNode meetPoint) {

        int cnt = 1;

        ListNode current = meetPoint.next;

        while (current != meetPoint) {
            cnt++;
            current = current.next;
        }

        return cnt;
    }
}