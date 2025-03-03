class divide {
    public int div(int dividend, int divisor) {
        // Handle special case where dividend is equal to divisor
        if (dividend == divisor) {
            return 1;
        }

        // Determine the sign of the result
        boolean sign = true;
        if ((dividend < 0 && divisor > 0) || (dividend > 0 && divisor < 0)) {
            sign = false;
        }

        // Convert to long to handle overflow cases
        long n = Math.abs((long) dividend);
        long d = Math.abs((long) divisor);
        long quotient = 0;

        while (n >= d) {
            int cnt = 0;
            while (n >= (d << (cnt + 1))) {
                cnt++;
            }

            quotient += (1L << cnt);
            n -= (d << cnt);
        }

        // Handle overflow case
        if (quotient > Integer.MAX_VALUE) {
            return sign ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }

        return sign ? (int) quotient : (int) -quotient;
    }
}
