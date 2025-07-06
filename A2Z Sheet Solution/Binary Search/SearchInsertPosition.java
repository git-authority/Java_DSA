public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {

        int lb = 0, ub = nums.length-1, mid = 0;

        while(lb<=ub){

            mid = (lb+ub)>>1;

            if(nums[mid]>target){
                ub = mid - 1;
            }
            else if(nums[mid]<target){
                lb = mid + 1;
            }
            else{
                return mid;
            }
        }

        return lb;

    }

}
