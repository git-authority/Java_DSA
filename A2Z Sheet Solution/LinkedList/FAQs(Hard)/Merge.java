/*Definition of singly linked list:
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
 */

class Merge {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if(list1==null){
            return list2;
        }

        if(list2==null){
            return list1;
        }


        ListNode current = null, head = null, temp = null;


        if(list1.val<=list2.val){
            head = list1;
            list1 = list1.next;
        }
        else{
            head = list2;
            list2 = list2.next;
        }



        current = head;

        while(list1!=null && list2!=null){


            if(list1.val<list2.val){
                temp = list1;
                current.next = temp;

                current = current.next;
                list1 = list1.next;
            }
            else if(list1.val>list2.val){
                temp = list2;
                current.next = temp;

                current = current.next;
                list2 = list2.next;
            }
            else{
                temp = list2;
                current.next = temp;
                current = current.next;
                list2 = list2.next;
            }


        }

        // list1 finished
        if(list2!=null){
            current.next = list2;
        }
        // list2 finished
        else{
            current.next = list1;
        }

        return head;
    }
}