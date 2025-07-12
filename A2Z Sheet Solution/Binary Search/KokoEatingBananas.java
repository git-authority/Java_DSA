class KokoEatingBananas {

    // This calculates the total no of bananas/hr
    public int minimumRateToEatBananas(int[] nums, int h) {
        int low = 1, high = max(nums);

        while(low<=high){
          int mid = low + (high-low)/2;
          long sum = totalHours(nums, mid);

          // If he takes less than or equal to h hrs to eat bananas then he should decrease the banana intake, so that it increases the total time
          if(sum<=h){
            high = mid - 1;
          }
          // If he takes more than h hrs to eat bananas then he should increase the banana intake, so that it decreases the total time
          else{
            low = mid + 1;
          }

        }

        return high+1;
    }

    // This calculates the total time taken to finish bananas
    private long  totalHours(int[] nums, int mid){
      long sum = 0;
      for(int i = 0; i<nums.length;i++){
        sum+=(nums[i] + mid - 1)/mid;
      }

      return sum;
    }

    // This finds the maximum no. of bananas in a pile
    private int max(int[] nums){
      int maxi = Integer.MIN_VALUE;

      for(int i = 0;i<nums.length;i++){
        maxi = Math.max(maxi, nums[i]);
      }

      return maxi;
    }
}