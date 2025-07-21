class MinimizeMaxDistToGasStation{
    /* Function to calculate the number of gas
    stations required for given distance*/
    private int numberOfGasStationsRequired(double dist, int[] arr) {
        // Size of the array
        int n = arr.length;
        int cnt = 0;
        for (int i = 1; i < n; i++) {

            /* Calculate number of gas stations
            needed between two points*/
            int numberInBetween = (int) ((arr[i] - arr[i - 1]) / dist);

            // Adjust if exact distance fits perfectly
            if ((arr[i] - arr[i - 1]) == (dist * numberInBetween)) {
                numberInBetween--;
            }

            cnt += numberInBetween;
        }
        return cnt;
    }

    /* Function to minimize the maximum
    distance between gas stations*/
    public double minimiseMaxDistance(int[] arr, int k) {
        int n = arr.length;
        double low = 0;
        double high = 0;

        /* Find the maximum distance between
        consecutive gas stations*/
        for (int i = 0; i < n - 1; i++) {
            high = Math.max(high, arr[i + 1] - arr[i]);
        }

        /* Apply Binary search to find the
        minimum possible maximum distance*/
        double diff = 1e-6;
        while (high - low > diff) {
            double mid = (low + high) / 2.0;
            int cnt = numberOfGasStationsRequired(mid, arr);

            /* Adjust the search range based on
            the number of gas stations required*/
            if (cnt > k) {
                low = mid;
            } else {
                high = mid;
            }
        }

        // Return smallest maximum distance found
        return high;
    }
}