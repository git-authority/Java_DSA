class ShipPackages {
    public int shipWithinDays(int[] weights, int days) {

        int high = 0;
        int low = Integer.MIN_VALUE;
        int totalDays = 1;

        for (int i = 0; i < weights.length; i++) {
            high += weights[i];
            low = Math.max(low, weights[i]);
        }

        while (low <= high) {

            int mid = low + (high - low) / 2;
            int calculatedDays = countDays(weights, mid);

            if (calculatedDays <= days) {
            high = mid - 1;
            } else {
            low = mid + 1;
        }

        }

        return low;

    }

    private int countDays(int[] weights, int capacity) {

        int load = weights[0];
        int totalDays = 1;

        for (int i = 1; i < weights.length; i++) {
            if (weights[i] + load > capacity) {
                totalDays++;
                load = weights[i];
            } else {
                load += weights[i];
            }
        }

        return totalDays;

    }

}