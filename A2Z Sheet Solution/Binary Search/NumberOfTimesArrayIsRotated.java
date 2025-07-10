import java.util.*;

class NumberOfTimesArrayIsRotated {
    public int findKRotation(ArrayList<Integer> nums) {
        int left = 0, right = nums.size()-1;

        int min = Integer.MAX_VALUE;

        while(left<=right){
            int mid = (left + right)>>1;

            // Left part is sorted
            if(nums.get(left)<=nums.get(mid)){
                min = Math.min(min, nums.get(left));
                left=mid+1;
            }
            // Right part is sorted
            else{
                min=Math.min(min, nums.get(mid));
                right=mid-1;
            }
        }

        return nums.indexOf(min);
    }
}