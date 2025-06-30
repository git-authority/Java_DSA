import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class FourSum{
public List<List<Integer>> fourSum(int[] nums, int target) {
    List<List<Integer>> ans = new ArrayList<>();
    int n = nums.length;

    // Sort the input array nums
    Arrays.sort(nums);

    // Iterate through the array to find quadruplets
    for (int i = 0; i < n; i++) {
        // Skip duplicates for i
        if (i > 0 && nums[i] == nums[i - 1])
            continue;

        for (int j = i + 1; j < n; j++) {
            // Skip duplicates for j
            if (j > i + 1 && nums[j] == nums[j - 1])
                continue;

            // Two pointers approach
            int k = j + 1;
            int l = n - 1;

            while (k < l) {
                long sum = (long) nums[i] + nums[j] + nums[k] + nums[l];

                if (sum == target) {
                    // Found a quadruplet that sums up to target
                    List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k], nums[l]);
                    ans.add(temp);

                    // Skip duplicates for k and l
                    k++;
                    l--;
                    while (k < l && nums[k] == nums[k - 1]) k++;
                    while (k < l && nums[l] == nums[l + 1]) l--;
                } else if (sum < target) {
                    k++;
                } else {
                    l--;
                }
            }
        }
    }

    return ans;
}
}