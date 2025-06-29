
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> res = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int moreNeeded = target - nums[i];

            if (res.containsKey(moreNeeded)) {
                return new int[]{res.get(moreNeeded), i};
            }

            res.put(nums[i], i);
        }

        return new int[]{-1, -1};

    }
}
