class ListNode {
    int val;
    ListNode next;
    ListNode child;

    ListNode() {
        val = 0;
        next = null;
        child = null;
    }

    ListNode(int data1) {
        val = data1;
        next = null;
        child = null;
    }

    ListNode(int data1, ListNode next1, ListNode next2) {
        val = data1;
        next = next1;
        child = next1;
    }
}

class FlattenLL {

    public ListNode flattenLinkedList(ListNode head) {
        // If head is null or there is no next node
        if (head == null || head.next == null) {
            return head;
        }

        ListNode mergedHead = flattenLinkedList(head.next);

        head = merge(head, mergedHead);
        return head;
    }


    private ListNode merge(ListNode list1, ListNode list2) {

        ListNode dummyNode = new ListNode(-1);
        ListNode res = dummyNode;


        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                res.child = list1;
                res = list1;
                list1 = list1.child;
            } else {
                res.child = list2;
                res = list2;
                list2 = list2.child;
            }
            res.next = null;
        }


        if (list1 != null) {
            res.child = list1;
        } else {
            res.child = list2;
        }

        // Break the last node's link to prevent cycles
        if (dummyNode.child != null) {
            dummyNode.child.next = null;
        }

        return dummyNode.child;
    }

}