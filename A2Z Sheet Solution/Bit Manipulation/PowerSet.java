import java.util.ArrayList;
import java.util.List;

public class PowerSet {
    /* Function call to get the
    Power set of given array */
    public List<List<Integer>> subsets(int[] nums) {

        // Variable to store size of array
        int n = nums.length;

        // To store the answer
        List<List<Integer>> ans = new ArrayList<>();

        /* Variable to store the
        count of total susbsets */
        int count = (1 << n);

        // Traverse for every value
        for (int val = 0; val < count; val++) {

            // To store the current subset
            List<Integer> subset = new ArrayList<>();

            // Traverse on n bits
            for (int i = 0; i < n; i++) {
                if ((val & (1 << i)) != 0) {  // Checks ith bit is set or not
                    subset.add(nums[i]);
                }
            }

            /* Add the current subset
            to final answer */
            ans.add(subset);
        }

        // Return stored answer
        return ans;
    }
}
