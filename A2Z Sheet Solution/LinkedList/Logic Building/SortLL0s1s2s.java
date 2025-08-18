/* Definition of singly Linked List:
class ListNode {
    int val;
    ListNode next;

    ListNode(int data1) {
        val = data1;
        next = null;
    }

    ListNode(int data1, ListNode next1) {
        val = data1;
        next = next1;
    }
}
*/

class SortLL0s1s2s {
    public ListNode sortList(ListNode head) {

        if(head == null){
            return head;
        }


        ListNode zero = new ListNode(-1);
        ListNode zeroHead = zero;

        ListNode one = new ListNode(-1);
        ListNode oneHead = one;

        ListNode two = new ListNode(-1);
        ListNode twoHead = two;

        ListNode current = head;

        while(current!=null){

            if(current.val == 0){
                zero.next = current;
                zero = zero.next;
            }
            else if(current.val == 1){
                one.next = current;
                one = one.next;
            }
            else{
                two.next = current;
                two = two.next;
            }

            current = current.next;
        }

        zero.next = (oneHead.next != null) ? oneHead.next : twoHead.next;

        one.next = twoHead.next;

        two.next = null;

        return zeroHead.next;

    }

}