public class IsPalindrome {
    public boolean isPalindrome(ListNode head) {



        // Finding the middle element

        ListNode slow = head;
        ListNode fast = head;

        // Using condition fast.next!=null otherwise it will throw null pointer exception for odd length list.
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }


        /*
            The second half head is slow.next if the list is odd length,
            otherwise, the second half head is slow if the list is even length.
        */

        ListNode secondHalfHead = (fast != null) ? slow.next : slow;




        // Main Palindrome Operation starts here

        secondHalfHead = reverseLL(secondHalfHead);

        ListNode current = head;
        ListNode secondHalfCurrent = secondHalfHead;

        while(secondHalfCurrent!=null){
            if(current.val!=secondHalfCurrent.val){
                secondHalfCurrent = reverseLL(secondHalfCurrent);
                return false;
            }
            current = current.next;
            secondHalfCurrent = secondHalfCurrent.next;
        }

        secondHalfCurrent = reverseLL(secondHalfCurrent);

        return true;
    }


    private ListNode reverseLL(ListNode head){
        ListNode current = head;

        ListNode reverseLLHead = null;

        while(current!=null){
            ListNode nextNode = current.next;
            current.next = reverseLLHead;
            reverseLLHead = current;
            current = nextNode;
        }

        return reverseLLHead;
    }
}