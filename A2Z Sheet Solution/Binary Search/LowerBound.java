class LowerBound {
  public int lowerBound(int[] nums, int x) {

    int lb = 0, ub = nums.length - 1, mid = 0;

    while (lb <= ub) {

        mid = (lb + ub) >> 1;

        if (nums[mid] >= x) {

            ub = mid - 1;
        }

        else{

            lb = mid + 1;

        }

    }

    return lb;

  }
}
