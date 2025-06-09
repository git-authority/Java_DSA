import java.util.*;

public class MergeSort {
    public int[] mergeSort(int[] nums) {
        mergeSortHelper(nums, 0, nums.length-1);
        return nums;
    }

    public void mergeSortHelper(int[] nums, int low, int high){

        // Base Condition, if array contains only one element
        if(low >= high)   return;

        int mid = (low + high)/2;

        // Recursion 1: Left Part
        mergeSortHelper(nums, low, mid);

        // Recursion 2: Right Part
        mergeSortHelper(nums, mid + 1, high);

        // Merge
        merge(nums, low, mid, high);
    }

    public void merge(int[] nums, int low, int mid, int high){

        List<Integer> temp = new ArrayList<>();

        int left = low;
        int right = mid + 1;


        while(left<=mid && right<=high){

            // Compare left and right elements and merge
            if(nums[left]<=nums[right]){
                temp.add(nums[left]);
                left++;
            }
            else{
                temp.add(nums[right]);
                right++;
            }
        }

        // Put the remaining elements in the  ArrayList
        while(left<=mid){
            temp.add(nums[left]);
            left++;
        }

        // Put the remaining elements in the  ArrayList
        while(right<=high){
            temp.add(nums[right]);
            right++;
        }

        for(int i = low; i<=high; i++){
            nums[i] = temp.get(i - low);
        }
    }
}
