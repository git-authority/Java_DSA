import java.util.*;

class ImplementStackUsingQueue {

    Queue<Integer> q = new LinkedList<>();


    public void push(int x) {

        int s = q.size();

        q.add(x);

        for (int i = 0; i < s; i++) {
            q.add(q.poll());
        }
    }

    public int pop() {

        int n = q.peek();

        q.poll();

        return n;
    }

    public int top() {

        return q.peek();
    }

    public boolean isEmpty() {
        return q.isEmpty();
    }
}