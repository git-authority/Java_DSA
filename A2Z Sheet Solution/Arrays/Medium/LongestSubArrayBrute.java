
public class LongestSubArrayBrute {

    public int longestSubarray(int[] nums, int k) {

        int maxCountSoFar = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            int sum = nums[i];
            count = 1; // Count the no of occurences

            if (sum == k) {
                maxCountSoFar = Math.max(maxCountSoFar, count);
            }

            for (int j = i + 1; j < nums.length; j++) {

                sum += nums[j];
                count++;

                if (sum == k) {
                    maxCountSoFar = Math.max(count, maxCountSoFar);
                }
            }
        }
        return maxCountSoFar;
    }

}
