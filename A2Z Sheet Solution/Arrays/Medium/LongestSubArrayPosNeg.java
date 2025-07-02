import java.util.HashMap;
import java.util.Map;

public class LongestSubArrayPosNeg {



// The prefix sum at index i is the sum of all elements from the start of the array up to index i.

    public int longestSubarray(int[] nums, int k) {

        // Stores each prefix sum and the earliest index where each sum occurs
        Map<Integer, Integer> mapSum = new HashMap<>();

        int len = 0;      // length of current target subarray
        int maxLen = 0;   // maximum length of target subarray found so far
        int sum = 0;      // current prefix sum

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            // If entire subarray from 0 to i sums to k
            if (sum == k) {
                maxLen = Math.max(maxLen, i + 1);
            }

            // Check if (sum - k) exists as a prefix sum
            int requiredSum = sum - k;

            // If such a prefix sum was seen before, a subarray summing to k exists and is being found in the HashMap
            if (mapSum.containsKey(requiredSum)) {
                len = i - mapSum.get(requiredSum);  // length of that subarray
                maxLen = Math.max(len, maxLen);     // update result
            }

            // Store the first occurrence of the current prefix sum
            if (!mapSum.containsKey(sum)) {
                mapSum.put(sum, i);
            }
        }

        return maxLen;
    }
}
