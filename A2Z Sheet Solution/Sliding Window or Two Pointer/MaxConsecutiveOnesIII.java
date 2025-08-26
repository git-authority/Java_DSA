public class MaxConsecutiveOnesIII {
    public int longestOnes(int[] nums, int k) {
        //your code goes here

        int n = nums.length;

        int left = 0, right = 0, maxLen = 0;

        int zeros = 0;

        while(right<n){
            if(nums[right] == 0){
                zeros++;
            }

            while(zeros>k){
                if(nums[left] == 0){
                    zeros--;
                }

                left++;
            }

            maxLen = Math.max(right-left+1, maxLen);

            right++;
        }

        return maxLen;
    }
}