class SmallestDivisor {
    public int smallestDivisor(int[] nums, int limit) {
       int max = Integer.MIN_VALUE;

        if (nums.length>limit)  return -1;

        // Find max element in array
       for(int i = 0;i<nums.length;i++){
          max = Math.max(max, nums[i]);
       }

        int low = 1, high = max;

        while(low<=high){
          int mid  = (low+high)/2;

          if(sumByD(nums, mid)<=limit){
            high = mid - 1;
          }
          else{
            low = mid + 1;
          }
        }

        return low;

    }


    // Helper function to find sum of (each no. by divisor)
    private int sumByD(int[] nums, int divisor){
      int n = nums.length;

      int sum = 0;
      for(int i = 0;i<n;i++){
        sum+=Math.ceil((double)nums[i]/(double)divisor);
      }
      return sum;
    }
}