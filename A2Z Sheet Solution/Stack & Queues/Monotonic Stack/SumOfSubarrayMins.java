import java.util.*;

public class SumOfSubarrayMins {
    public int sumSubarrayMins(int[] arr) {


        /* nse[i] stores the index of the closest
           element to the RIGHT of i whose value is < arr[i]. */
        int[] nse = findNSE(arr);

        /* psee[i] stores the index of the closest
           element to the LEFT of i whose value is ≤ arr[i]. */
        int[] psee = findPSEE(arr);

        int n = arr.length;

        int mod = (int)1e9 + 7;

        int sum = 0;

        for (int i = 0; i < n; i++) {

            /* left and right count how many ways
               a subarray can start and end */

            int left = i - psee[i];
            int right = nse[i] - i;

            long freq = left * right * 1L;

            int val = (int)((freq * arr[i]) % mod);

            sum = (sum + val) % mod;
        }

        return sum;
    }

    private int[] findNSE(int[] arr) {

        int n = arr.length;
        int[] ans = new int[n];

        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {

            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }

            ans[i] = !st.isEmpty() ? st.peek() : n;

            st.push(i);
        }

        return ans;
    }

    private int[] findPSEE(int[] arr) {

        int n = arr.length;
        int[] ans = new int[n];

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {

            while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
                st.pop();
            }

            ans[i] = !st.isEmpty() ? st.peek() : -1;

            st.push(i);
        }

        return ans;
    }
};
