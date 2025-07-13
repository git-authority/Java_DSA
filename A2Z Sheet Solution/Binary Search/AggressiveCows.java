import java.util.Arrays;

public class AggressiveCows {
    public int aggressiveCows(int[] nums, int k) {
      Arrays.sort(nums);
      int low = 1;
      int high = nums[nums.length-1]-nums[0];

      while(low<=high){
        int mid = low + (high-low)/2;

        // If we can place then we go for a higher distance
        if(canWePlace(nums, mid, k) == true){
          low = mid + 1;
        }
        // Else we go for lower distances
        else{
          high = mid - 1;
        }
      }

      return high;
    }

    private boolean canWePlace(int[] nums, int mid, int k){
      int lastPlaced = nums[0];

      int totalPlaced = 1;
      for(int i = 1;i<nums.length;i++){
        if(nums[i]-lastPlaced>=mid){
          totalPlaced++;
          lastPlaced = nums[i];
        }
        if(totalPlaced>=k)  return true;
      }

      return false;
    }
}
