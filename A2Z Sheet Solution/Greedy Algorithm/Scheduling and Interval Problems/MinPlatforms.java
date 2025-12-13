import java.util.*;

public class MinPlatforms {

    public int findPlatform(int[] Arrival, int[] Departure) {
        int n = Arrival.length;

        Arrays.sort(Arrival);
        Arrays.sort(Departure);

        int ans = 1;
        int count = 1;
        int i = 1, j = 0;


        while (i < n && j < n) {

            // If two train times overlap
            if (Arrival[i] <= Departure[j]) {
                count++;
                i++;
                ans = Math.max(ans, count);
            }
            else {
                count--;
                j++;
            }

        }
        return ans;
    }
}
