import java.util.*;;

public class NMeetings {
    public int maxMeetings(int[] start, int[] end) {

        List<int[]> meetings = new ArrayList<>();

        for(int i = 0; i<end.length; i++){
            meetings.add(new int[]{start[i], end[i]});
        }

        // Sort meetings in ascending order based on end times
        Collections.sort(meetings, (a, b) -> a[1] - b[1]);

        int limit = meetings.get(0)[1];

        int count = 1;

        for(int i = 1; i<meetings.size(); i++){
            if(meetings.get(i)[0]>limit){
                limit = meetings.get(i)[1];
                count++;
            }
        }

        return count;
    }
}