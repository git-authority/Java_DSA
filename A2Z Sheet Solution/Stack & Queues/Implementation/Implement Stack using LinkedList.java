

// Head is top of stack always

class Node {
    int val;
    Node next;
    Node(int d) {
        val = d;
        next = null;
    }
}


class LinkedListStack {
    private Node head;
    private int size;

    // Constructor
    public LinkedListStack() {
        head = null;
        size = 0;
    }


    public void push(int x) {

        Node element = new Node(x);

        element.next = head;
        head = element;

        size++;
    }

    public int pop() {
        if (head == null) {
            return -1;
        }

        int value = head.val;
        Node temp = head;
        head = head.next;
        temp = null;
        size--;

        return value;
    }


    public int top() {

        if (head == null) {
            return -1;
        }

        return head.val;
    }

    public boolean isEmpty() {
        return (size == 0);
    }
}
