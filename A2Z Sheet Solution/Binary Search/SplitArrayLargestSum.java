
public class SplitArrayLargestSum {

    /* Function to count partitions such
    that each partition has sum <= maxSum*/
    private int countPartitions(int[] a, int maxSum) {
        int n = a.length;
        int partitions = 1;
        long subarraySum = 0;

        for (int i = 0; i < n; i++) {
            if (subarraySum + a[i] <= maxSum) {
                // Add element to the current subarray
                subarraySum += a[i];
            } else {
                // Start a new subarray with current element
                partitions++;
                subarraySum = a[i];
            }
        }

        return partitions;
    }

    /* Function to find the largest minimum
    subarray sum with at most k partitions*/
    public int splitArray(int[] a, int k) {

        // Initialize binary search boundaries
        int low = a[0];
        int high = 0;

        //Find maximum and summation
        for (int i = 0; i < a.length; i++) {
            low = Math.max(low, a[i]);
            high += a[i];
        }
        // Apply binary search
        while (low <= high) {
            int mid = (low + high) / 2;
            int partitions = countPartitions(a, mid);

            if (partitions > k) {
                /* If partitions exceed k, increase
                the minimum possible subarray sum*/
                low = mid + 1;
            } else {
                /* If partitions are within k, try to
                minimize the subarray sum further*/
                high = mid - 1;
            }
        }

        /* After binary search, 'low' will
        be the largest minimum subarray sum
        with at most k partitions*/
        return low;
    }
}
