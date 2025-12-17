public class NiceSubarrays {
    public int numberOfOddSubarrays(int[] nums, int k) {

        return helper(nums, k) - helper(nums, k - 1);
    }

    private int helper(int[] nums, int goal) {

        if (goal < 0) return 0;

        int l = 0, r = 0;
        int sum = 0;
        int count = 0;

        while (r < nums.length) {
            sum += nums[r] % 2;

            while (sum > goal) {
                sum -= nums[l] % 2;
                l++;
            }

            count += (r - l + 1);

            r++;
        }

        return count;
    }
};