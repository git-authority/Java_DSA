import java.util.*;

class CombinationSumII {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);  // Sort to easily handle duplicates
        backtrack(0, target, new ArrayList<>(), candidates, ans);
        return ans;
    }

    private void backtrack(int start, int target, List<Integer> current, int[] candidates, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            // Skip duplicates after sorting
            if (i > start && candidates[i] == candidates[i - 1]) continue;

            if (candidates[i] > target) break; // Optimization, as array is sorted, so if current num is greater than target, remaining nos will also be greater so no point in continuing

            current.add(candidates[i]);
            backtrack(i + 1, target - candidates[i], current, candidates, result);
            current.remove(current.size() - 1); // Backtrack

        }
    }
}
