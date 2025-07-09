class SearchInRotatedSortedArray_II {
    public boolean searchInARotatedSortedArrayII(int[] nums, int k) {
        int lb = 0, ub = nums.length - 1;

        while (lb <= ub) {
            int mid = (lb + ub) >> 1;

            if (nums[mid] == k) return true;

            // If duplicates make it hard to determine sorted half
            if (nums[lb] == nums[mid] && nums[mid] == nums[ub]) {
                lb++;
                ub--;
                continue;
            }

            // Left part is sorted
            if (nums[lb] <= nums[mid]) {
                if (nums[lb] <= k && k <= nums[mid]) {
                    ub = mid - 1;
                } else {
                    lb = mid + 1;
                }
            }

            // Right part is sorted
            else {
                if (nums[mid] <= k && k <= nums[ub]) {
                    lb = mid + 1;
                } else {
                    ub = mid - 1;
                }
            }
        }

        return false;
    }
}
