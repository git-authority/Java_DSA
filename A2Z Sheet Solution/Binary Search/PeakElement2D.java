public class PeakElement2D {
/* Helper function to find the index of the row
    with the maximum element in a given column*/
    public int maxElement(int[][] arr, int col) {
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int index = -1;

        /* Iterate through each row to find the
        maximum element in the specified column*/
        for (int i = 0; i < n; i++) {
            if (arr[i][col] > max) {
                max = arr[i][col];
                index = i;
            }
        }
        //Return the index
        return index;
    }

    /* Function to find a peak element in
    the 2D matrix using binary search */
    public int[] findPeakGrid(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;

        /* Initialize the lower bound for
        and upper bound for binary search */
        int low = 0;
        int high = m - 1;

        // Perform binary search on columns
        while (low <= high) {
            int mid = (low + high) / 2;

            /* Find the index of the row with the
            maximum element in the middle column*/
            int maxRowIndex = maxElement(arr, mid);

            /* Determine the elements to left and
            right of middle element in the found row */
            int left = mid - 1 >= 0 ? arr[maxRowIndex][mid - 1] : -1;
            int right = mid + 1 < m ? arr[maxRowIndex][mid + 1] : -1;

            /* Check if the middle element
            is greater than its neighbors */
            if (arr[maxRowIndex][mid] > left && arr[maxRowIndex][mid] > right) {
                return new int[]{maxRowIndex,mid};
            }
            else if (left > arr[maxRowIndex][mid]) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }

        // Return -1 if no peak element is found
        return new int[]{-1,-1};
    }
}
