class ArrayStack {

    private int[] stackArray;
    private int capacity;
    private int topIndex;

    // Constructor
    public ArrayStack(int size) {
        capacity = size;
        stackArray = new int[capacity];
        topIndex = -1;
    }

    public ArrayStack() {
        this(1000);
    }


    public void push(int x) {
        if (topIndex >= capacity - 1) {
            System.out.println("Stack overflow");
            return;
        }
        stackArray[++topIndex] = x;
    }


    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stackArray[topIndex--];
    }


    public int top() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stackArray[topIndex];
    }

    public boolean isEmpty() {
        return topIndex == -1;
    }
}