import java.util.*;

class SumOfSubarrayRanges {

    /* Function to find the indices of
    next smaller elements */
    private int[] findNSE(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            int currEle = arr[i];
            while (!st.isEmpty() && arr[st.peek()] >= currEle) {
                st.pop();
            }
            ans[i] = !st.isEmpty() ? st.peek() : n;
            st.push(i);
        }
        return ans;
    }


    /* Function to find the indices of
    next greater elements */
    private int[] findNGE(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            int currEle = arr[i];
            while (!st.isEmpty() && arr[st.peek()] <= currEle) {
                st.pop();
            }
            ans[i] = !st.isEmpty() ? st.peek() : n;
            st.push(i);
        }
        return ans;
    }


    /* Function to find the indices of
    previous smaller or equal elements */
    private int[] findPSEE(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            int currEle = arr[i];
            while (!st.isEmpty() && arr[st.peek()] > currEle) {
                st.pop();
            }
            ans[i] = !st.isEmpty() ? st.peek() : -1;
            st.push(i);
        }
        return ans;
    }


    /* Function to find the indices of
    previous greater or equal elements */
    private int[] findPGEE(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            int currEle = arr[i];
            while (!st.isEmpty() && arr[st.peek()] < currEle) {
                st.pop();
            }
            ans[i] = !st.isEmpty() ? st.peek() : -1;
            st.push(i);
        }
        return ans;
    }


    /* Function to find the sum of the
    minimum value in each subarray */
    private long sumSubarrayMins(int[] arr) {
        int[] nse = findNSE(arr);
        int[] psee = findPSEE(arr);
        int n = arr.length;
        long sum = 0;

        for (int i = 0; i < n; i++) {
            int left = i - psee[i];
            int right = nse[i] - i;
            long freq = left * right * 1L;
            sum += freq * arr[i];
        }
        return sum;
    }


    /* Function to find the sum of the
    maximum value in each subarray */
    private long sumSubarrayMaxs(int[] arr) {
        int[] nge = findNGE(arr);
        int[] pgee = findPGEE(arr);
        int n = arr.length;
        long sum = 0;

        for (int i = 0; i < n; i++) {
            int left = i - pgee[i];
            int right = nge[i] - i;
            long freq = left * right * 1L;
            sum += freq * arr[i];
        }
        return sum;
    }


    /* Function to find the sum of
    subarray ranges in each subarray */
    public long subArrayRanges(int[] arr) {
        return sumSubarrayMaxs(arr) - sumSubarrayMins(arr);
    }
}
