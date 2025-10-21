public class ReversePairs {
    public int reversePairs(int[] nums) {
        int n = nums.length;
        return mergeSort(nums, 0, n - 1);
    }

    private int mergeSort(int[] nums, int low, int high) {

        int count = 0;

        if (low < high) {

            int mid = low + (high - low) / 2;

            count += mergeSort(nums, low, mid);
            count += mergeSort(nums, mid + 1, high);
            count += merge(nums, low, mid, high);

        }
        return count;
    }

    private int merge(int[] nums, int low, int mid, int high) {
        int count = 0;

        // Count reverse pairs
        int j = mid + 1;

        for (int i = low; i <= mid; i++) {

            while (j <= high && (long) nums[i] > 2L * nums[j]){
                j++;
            }
            count += (j - (mid + 1));
        }



        // Merge step
        int[] temp = new int[high - low + 1];
        int left = low, right = mid + 1, index = 0;

        while (left <= mid && right <= high) {
            if (nums[left] <= nums[right]) {
                temp[index++] = nums[left++];
            }
            else {
                temp[index++] = nums[right++];
            }
        }

        while (left <= mid){
            temp[index++] = nums[left++];
        }

        while (right <= high){
            temp[index++] = nums[right++];
        }

        System.arraycopy(temp, 0, nums, low, temp.length);

        return count;
    }
}
