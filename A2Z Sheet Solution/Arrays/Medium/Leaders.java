
import java.util.ArrayList;
import java.util.Collections;

public class Leaders {

    public ArrayList<Integer> leaders(int[] nums) {

        int max = nums[nums.length - 1];
        int i = 0;
        ArrayList<Integer> leader = new ArrayList<>();

        leader.add(max);

        for (i = nums.length - 2; i >= 0; i--) {
            if (nums[i] > max) {
                max = nums[i];
                leader.add(max);
            }
        }

        Collections.reverse(leader);

        return leader;

    }

}
