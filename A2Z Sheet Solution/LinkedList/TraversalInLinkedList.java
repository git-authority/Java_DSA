import java.util.*;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
        val = 0;
        next = null;
    }
}

class TraversalInLinkedList {
    public List<Integer> LLTraversal(ListNode head) {
        ListNode temp = head;

        List<Integer> ans = new ArrayList<>();

        while(temp!=null){
            ans.add(temp.val);
            temp = temp.next;
        }
        return ans;
    }
}