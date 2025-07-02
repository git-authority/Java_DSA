import java.util.HashMap;
import java.util.Map;

public class SubarraysWithGivenSum {
  public int subarraySum(int[] nums, int k) {

    Map<Integer, Integer> prefixSumMap = new HashMap<>();
    int sum = 0;
    int resultCount = 0;

    for (int i = 0; i < nums.length; i++) {

      sum += nums[i];

      if (sum == k) {
        resultCount++;
      }

      int remSum = sum - k;

      if (prefixSumMap.containsKey(remSum)) {

        resultCount += prefixSumMap.get(remSum);
      }

      prefixSumMap.put(sum, prefixSumMap.getOrDefault(sum, 0) + 1);
    }
    return resultCount;
  }
}
