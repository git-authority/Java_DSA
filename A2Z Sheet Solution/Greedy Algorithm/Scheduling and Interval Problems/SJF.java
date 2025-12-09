import java.util.*;

public class SJF {
    public long solve(int[] bt) {

        Arrays.sort(bt);
        long waitingTime = 0;
        int burstTimeSoFar = 0;
        for(int i = 0; i<bt.length-1; i++){
          burstTimeSoFar+=bt[i];
          waitingTime+=burstTimeSoFar;
        }
        return waitingTime/bt.length;
    }
}