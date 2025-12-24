package FAQs;

import java.util.*;

public class SlidingWindowMaximum {
    public int[] maxSlidingWindow(int[] arr, int k) {

        int n = arr.length;

        int[] ans = new int[n - k + 1];
        int ansIndex = 0;

        Deque<Integer> dq = new LinkedList<>();

        for (int i = 0; i < n; i++) {

            // Remove element from front if the window size exceeds
            if (!dq.isEmpty() && dq.peekFirst() <= (i - k)) {
                dq.pollFirst();
            }

            /* Maintain the monotonic (decreasing)
            order of elements in deque */
            while (!dq.isEmpty() && arr[dq.peekLast()] <= arr[i]) {
                dq.pollLast();
            }

            // Add current element's index to the deque
            dq.offerLast(i);

            // Store the maximum element
            if (i >= (k - 1)) {
                ans[ansIndex++] = arr[dq.peekFirst()];
            }
        }


        return ans;
    }
}