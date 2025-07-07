class FirstAndLastOccurence {
    public int[] searchRange(int[] nums, int target) {

        int start = firstHalf(nums, target) ;
        int end = secondHalf(nums, target);

        return new int[]{start, end};

    }


    private int firstHalf(int[] nums, int target){

        int lb = 0, ub = nums.length-1;
        int start = -1;

        while(lb<=ub){

            int mid = (lb+ub)>>1;

            if(nums[mid]>target){
                ub=mid-1;
            }
            else if(nums[mid]<target){
                lb = mid + 1;
            }
            else{

                start = mid;

                ub = mid - 1;

            }
        }

        return start;

    }

    private int secondHalf(int[] nums, int target){

        int lb = 0, ub = nums.length-1;
        int end = -1;

        while(lb<=ub){

            int mid = (lb+ub)>>1;

            if(nums[mid]>target){
                ub=mid-1;
            }
            else if(nums[mid]<target){
                lb = mid + 1;
            }
            else{

                end = mid;

                lb = mid+1;

            }
        }

        return end;
    }
}


