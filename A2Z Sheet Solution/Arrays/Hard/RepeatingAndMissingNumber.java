class RepeatingAndMissingNumber {

    public int[] findMissingRepeatingNumbers(int[] nums) {


        long n = nums.length;

        // Sum of first n natural numbers
        long SN = (n * (n + 1)) / 2;

        // Sum of squares of first n natural numbers
        long S2N = (n * (n + 1) * (2 * n + 1)) / 6;

        /* Calculate actual sum (S) and sum
           of squares (S2) of array elements */
        long S = 0, S2 = 0;
        for (int i = 0; i < n; i++) {
            S += nums[i];
            S2 += (long) nums[i] * (long) nums[i];
        }

        // Compute the difference values
        long val1 = S - SN;

        // S2 - S2n = X^2 - Y^2
        long val2 = S2 - S2N;

        // Calculate X + Y using X + Y = (X^2 - Y^2) / (X - Y)
        val2 = val2 / val1;

        /* Calculate X and Y from X + Y and X - Y
           X = ((X + Y) + (X - Y)) / 2
           Y = X - (X - Y) */
        long x = (val1 + val2) / 2;
        long y = x - val1;

        // Return the results as [repeating, missing]
        return new int[]{(int) x, (int) y};
    }
}