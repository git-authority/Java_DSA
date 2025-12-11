import java.util.*;

public class JobScheduling {

    public int[] jobScheduling(int[][] Jobs) {

        // Sort jobs based on profit in descending order
        Arrays.sort(Jobs, (a, b) -> b[2] - a[2]);

        int n = Jobs.length;
        int maxDeadline = -1;

        for (int[] it : Jobs) {
            maxDeadline = Math.max(maxDeadline, it[1]);
        }

        int[] hash = new int[maxDeadline + 1];
        Arrays.fill(hash, -1);

        int cnt = 0;
        int totalProfit = 0;

        for (int i = 0; i < n; i++) {

            // Start with delaying the job to the end days
            for (int j = Jobs[i][1] - 1; j >= 0; j--) {

                // If the current deadline slot is available
                if (hash[j] == -1) {
                    cnt++;
                    hash[j] = Jobs[i][0];
                    totalProfit += Jobs[i][2];

                    // Move to the next job
                    break;
                }
            }
        }

        return new int[]{cnt, totalProfit};
    }
}