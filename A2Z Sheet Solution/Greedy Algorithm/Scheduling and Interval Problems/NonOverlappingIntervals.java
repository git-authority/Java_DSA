import java.util.*;

public class NonOverlappingIntervals {
    public int MaximumNonOverlappingIntervals(int[][] interval) {

        int n = interval.length;

        Arrays.sort(interval, (a, b) -> a[1] - b[1]);

        int cnt = 1;
        int limit = interval[0][1];

        for(int i = 1; i<n; i++){
            if(interval[i][0]>=limit){
                limit = interval[i][1];
                cnt++;
            }
        }

        return n-cnt;

    }
}