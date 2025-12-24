import java.util.*;

public class MinStack {
    Stack<Integer> st;

    // Stores all the minimum elements encountered in chronological order
    Stack<Integer> minSt;

    public MinStack() {
        st = new Stack<>();
        minSt = new Stack<>();
    }

    public void push(int val) {
        st.push(val);

        // if val is smaller than minSt top element
        if (minSt.isEmpty() || val<=minSt.peek()){
            minSt.push(val);
        }

    }

    public void pop() {

        if(st.isEmpty()){
            return;
        }

        if(minSt.peek().equals(st.peek())){
            minSt.pop();
        }

        st.pop();
    }

    public int top() {
        return st.peek();
    }

    public int getMin() {
        return minSt.peek();
    }
}