import java.util.Arrays;

public class PrintDivisiors {
    public int[] divisors(int n) {

        // To store the divisors
        int[] temp = new int[n]; // Temporary array with max possible size
        int count = 0;

        int sqrtN = (int) Math.sqrt(n);

        // Iterate from 1 to sqrtN
        for(int i = 1; i <= sqrtN; i++) {

            // If a divisor is found
            if(n % i == 0) {
                // Add it to the answer
                temp[count++] = i;

                /* Add the counterpart divisor
                 if it's different from i */
                if(i != n / i) {            // if (i == n/i) then it's a perfect square and we should include the repeated divisor
                    temp[count++] = n / i;
                }
            }
        }

        // Copy only the filled part of temp to the result array
        int[] ans = Arrays.copyOf(temp, count);

        // Sorting the result
        Arrays.sort(ans);

        // Return the result
        return ans;
    }
}
