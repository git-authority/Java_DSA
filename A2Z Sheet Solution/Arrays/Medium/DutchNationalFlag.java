public class DutchNationalFlag {
    // Function to sort the array containing only 0s, 1s, and 2s
    public void sortZeroOneTwo(int[] nums) {

        // low should contain all 0s
        // mid should contain all 1s
        // high should contain all 2s
        int low = 0, mid = 0, high=nums.length-1;

        while(mid<=high){
            if(nums[mid]==0){
                int temp = nums[mid];
                nums[mid] = nums[low];
                nums[low] = temp;
                low++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
                // Please note that we don't increment mid.
                // This is because we have swapped nums[mid] and nums[high] and
                // after swapping it is possible that mid is pointing to 0 now which
                // should further be swapped with nums[low] and only then mid++
            }
        }
    }
}
