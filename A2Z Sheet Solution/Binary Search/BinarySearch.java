public class BinarySearch {
    public int search(int[] nums, int target) {
        int lb = 0, ub = nums.length-1;
        int mid = 0;

        while(lb<=ub){
            mid = (lb+ub)>>1;

            if(target>nums[mid]){
                lb = mid+1;
            }
            else if(target<nums[mid]){
                ub = mid - 1;
            }
            else{
                return mid;
            }
        }

        return -1;
    }
}
