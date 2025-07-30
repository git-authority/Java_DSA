import java.util.ArrayList;
import java.util.List;

class CombinationSum {
        public List<List<Integer>> combinationSum(int[] candidates, int target) {
            //your code goes here

            List<Integer> current = new ArrayList<>();
            List<List<Integer>> result = new ArrayList<>();

            findCombination(0, candidates, target, current, result);

            return result;
        }

        public void findCombination(int i, int[] candidates, int target, List<Integer> current, List<List<Integer>> result) {

            if(target == 0){
                result.add(new ArrayList<>(current));
                return;
            }

            if(i == candidates.length || target<0){
                return;
            }


            current.add(candidates[i]);
            // Add and don't move forward
            findCombination(i, candidates, target-candidates[i], current, result);

            current.remove(current.size() - 1);
            // Don't add and move forward
            findCombination(i+1, candidates, target, current, result);

        }
    }