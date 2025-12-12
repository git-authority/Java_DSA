import java.util.*;
public class InsertNewIntervals {
    public int[][] insertNewInterval(int[][] intervals, int[] newInterval) {

        List<int[]> res = new ArrayList<>();

        int i = 0;

        int n = intervals.length;

        // Left
        while (i < n && intervals[i][1] < newInterval[0]) {
            res.add(intervals[i]);
            i++;
        }

        // Merge overlapping intervals
        while (i < n && intervals[i][0] <= newInterval[1]) {

            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);

            i++;
        }

        res.add(newInterval);


        // Right
        while (i < n) {
            res.add(intervals[i]);
            i++;
        }

        return res.toArray(new int[res.size()][]);
    }
}
