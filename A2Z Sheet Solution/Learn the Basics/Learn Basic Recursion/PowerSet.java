import java.util.*;
class PowerSet {

    public List<List<Integer>> powerSet(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        backtrack(0, nums.length, nums, current, ans);
        return ans;
    }

    // Helper function to generate all subsets
    private void backtrack(int index, int n, int[] nums, List<Integer> current, List<List<Integer>> ans) {

    if (index == n) {
        ans.add(new ArrayList<>(current));
        return;
    }

    // Include current element
    current.add(nums[index]);
    backtrack(index + 1, n, nums, current, ans);

    // Backtrack and explore exclusion
    current.remove(current.size() - 1);

    // Exclude current element
    backtrack(index + 1, n, nums, current, ans);
}

}