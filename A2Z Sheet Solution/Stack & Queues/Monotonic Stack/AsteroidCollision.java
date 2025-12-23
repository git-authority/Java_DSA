import java.util.*;

public class AsteroidCollision {
    public int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> st = new Stack<>();

        for (int a : asteroids) {

            if (a > 0) {
                st.push(a);
            } else {

                while (!st.isEmpty() && st.peek() > 0 && st.peek() < Math.abs(a)) {
                    st.pop();
                }

                if (!st.isEmpty() && st.peek() == Math.abs(a)) {
                    st.pop();
                }
                else if (st.isEmpty() || st.peek() < 0) {
                    st.push(a);
                }
            }
        }

        int[] result = new int[st.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = st.pop();
        }

        return result;
    }
}
