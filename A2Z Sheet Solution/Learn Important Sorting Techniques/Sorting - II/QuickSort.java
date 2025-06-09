public class QuickSort {
    public int[] quickSort(int[] nums) {
        quickSortHelper(nums, 0, nums.length-1);
        return nums;
    }

    public void quickSortHelper(int[] nums, int low, int high){
        if(low<high){
            int partitionIndex = partition(nums, low, high);

            // Recursion - 1 (Left Part of partitionIndex)
            quickSortHelper(nums, low, partitionIndex - 1);

            // Recursion - 2 (Right Part of partitionIndex)
            quickSortHelper(nums, partitionIndex + 1, high);

        }
        // Base Condition
        else{
            return;
        }
    }

    public int partition(int[] nums, int low, int high){

        // Generating a random index to improve performance
        int randomIndex = low + ((int)Math.random() * (high - low + 1));

        int temp = nums[randomIndex];
        nums[randomIndex] = nums[low];
        nums[low] = temp;

        int pivot = nums[low];

        int i = low;
        int j = high;

        while(i<j){

            // Elements smaller than pivot are placed on the left of pivot
            while(nums[i] <= pivot && i <= high - 1){
                i++;
            }

            // Elements greater than pivot are placed on the right of pivot
            while(nums[j] > pivot && j >= low + 1){
                j--;
            }

            // Swap elements at i and j if i < j
            if(i<j){

                int temp1 = nums[i];
                nums[i] = nums[j];
                nums[j] = temp1;

            }
        }

        // Placing the pivot at the correct position to undo the randomIndex thing.
        int temp2 = nums[low];
        nums[low] = nums[j];
        nums[j] = temp2;

        return j;
    }
}
