import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets_II {
  public List<List<Integer>> subsetsWithDup(int[] nums) {
    // your code goes here

    List<List<Integer>> result = new ArrayList<>();
    List<Integer> current = new ArrayList<>();

    Arrays.sort(nums);

    findSubsets(0, nums, current, result);

    return result;
  }

  private void findSubsets(int i, int[] nums, List<Integer> current, List<List<Integer>> result) {
    if (i == nums.length) {
      result.add(new ArrayList<>(current));
      return;
    }

    // Take
    current.add(nums[i]);
    findSubsets(i + 1, nums, current, result);

    current.remove(current.size() - 1);

    // Don't take
    while (i + 1 < nums.length && nums[i] == nums[i + 1]) i++;
    findSubsets(i + 1, nums, current, result);
  }
}
