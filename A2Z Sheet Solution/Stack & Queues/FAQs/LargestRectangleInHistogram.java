package FAQs;

import java.util.*;

public class LargestRectangleInHistogram {    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        Stack<Integer> st = new Stack<>();
        int largestArea = 0;

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                int ind = st.pop();
                int pse = st.isEmpty() ? -1 : st.peek();
                int nse = i;
                int area = heights[ind] * (nse - pse - 1);
                largestArea = Math.max(largestArea, area);
            }
            st.push(i);
        }

        while (!st.isEmpty()) {
            int ind = st.pop();
            int pse = st.isEmpty() ? -1 : st.peek();
            int nse = n;
            int area = heights[ind] * (nse - pse - 1);
            largestArea = Math.max(largestArea, area);
        }

        return largestArea;
    }
}
