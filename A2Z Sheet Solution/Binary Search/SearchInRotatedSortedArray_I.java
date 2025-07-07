public class SearchInRotatedSortedArray_I {
    public int search(int[] nums, int k) {

        int lb = 0, ub = nums.length-1;

        while(lb<=ub){

            int mid = (lb+ub)>>1;

            if(nums[mid]==k){
                return mid;
            }

            // Check if the left part is sorted
            if(nums[lb]<=nums[mid]){
                // Check if the target exists here
                if(nums[lb]<=k && k<nums[mid]){
                    ub = mid - 1;
                }
                // The target doesn't exist here
                else{
                    lb = mid + 1;
                }
            }
            // Check if the right part is sorted
            else{
                // Check if the target exists here
                if(nums[mid]<=k && k<=nums[ub])
                {
                    lb = mid + 1;
                }
                // The target doesn't exist here
                else{
                    ub = mid - 1;
                }
            }
        }

        return -1;

    }
}
