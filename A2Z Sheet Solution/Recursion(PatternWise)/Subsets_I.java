import java.util.ArrayList;
import java.util.List;

public class Subsets_I {
    public List<Integer> subsetSums(int[] nums) {
        //your code goes here
        List<Integer> result = new ArrayList<>();
        int sum = 0;

        sum(0, nums, sum, result);
        return result;
    }

    private void sum(int i, int[] nums, int sum, List<Integer> result){
      if(i==nums.length){
        result.add(sum);
        return;
      }

      // Take
      sum(i+1, nums, sum+nums[i], result);

      // Don't take
      sum(i+1, nums, sum, result);
    }
}
