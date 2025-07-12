public class MinimumDaysToMakeMBouquets {
    public int roseGarden(int n, int[] nums, int k, int m) {

        // k -> adjacent bloomed roses required to make a single bouquet.
        // m ->  No. of at least bouquets, each containing k roses that shall be made in min no of days


        //  Edge Case
        if((long)k*m>n){
            return -1;
        }


        int low = findMin(nums), high = findMax(nums);

        while(low<=high){
            int mid = low + (high-low)/2;    // No of days req to make bouquets with k flowers

            // If I can make m bouquets on day d then I can maybe also make m bouquets on less than d days
            if(countAdjacentRoses(nums, mid, k) >= m){
                high = mid - 1; // try earlier days
            } else {
                low = mid + 1; // need more days
            }

        }
        return low;


    }

    private int countAdjacentRoses(int[] nums, int mid, int k){

        int count = 0;  //counter to count the no. of adjacent roses
        int totalCount = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] <= mid){
                count++;
                if(count == k){
                    totalCount++;
                    count = 0;
                }
            } else {
                count = 0;
            }
        }

        return totalCount;
    }



    // Used to keep track of the lowest no. of days initially
    private int findMin(int[] nums){
        int min = Integer.MAX_VALUE;

        for(int i =0;i<nums.length;i++){
            min = Math.min(min, nums[i]);
        }

        return min;
    }

    // Used to determine high
    private int findMax(int[] nums){
        int max = Integer.MIN_VALUE;

        for(int i =0;i<nums.length;i++){
            max = Math.max(max, nums[i]);
        }

        return max;
    }
}
