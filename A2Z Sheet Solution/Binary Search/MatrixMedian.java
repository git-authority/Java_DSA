
class MatrixMedian {

    // Function to find the upper bound of an element
    private int upperBound(int[] arr, int x, int m) {
        int low = 0, high = m - 1;
        int ans = m;

        // Apply binary search
        while (low <= high) {
            int mid = (low + high) / 2;

            // If arr[mid] > x, it can be a possible answer
            if (arr[mid] > x) {
                ans = mid;
                // Look for smaller index on the left
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        // Return the answer
        return ans;
    }

    // Function to find the count of elements smaller than or equal to x
    private int countSmallEqual(int[][] matrix, int n, int m, int x) {
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            cnt += upperBound(matrix[i], x, m);
        }
        // Return the count
        return cnt;
    }

    // Function to find the median in a matrix
    public int findMedian(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        // Initialize low and high
        int low = Integer.MAX_VALUE, high = Integer.MIN_VALUE;

        // Point low and high to right elements
        for (int i = 0; i < n; i++) {
            low = Math.min(low, matrix[i][0]);
            high = Math.max(high, matrix[i][m - 1]);
        }

        int req = (n * m) / 2;

        // Perform binary search
        while (low <= high) {
            int mid = low + (high - low) / 2;

            /* Store the count of elements
            lesser than or equal to mid */
            int smallEqual = countSmallEqual(matrix, n, m, mid);
            if (smallEqual <= req) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        // Return low as answer
        return low;
    }
}
