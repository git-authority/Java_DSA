
public class FloorAndCeil {

    public int[] getFloorAndCeil(int[] nums, int target) {
        int lb = 0, ub = nums.length - 1;
        int floor = -1, ceil = -1;

        while (lb <= ub) {
            int mid = (lb + ub) >> 1;

            if (nums[mid] == target) {
                return new int[]{nums[mid], nums[mid]};
            } else if (nums[mid] < target) {
                floor = nums[mid]; // possible floor
                lb = mid + 1;
            } else {
                ceil = nums[mid]; // possible ceil
                ub = mid - 1;
            }
        }

        return new int[]{floor, ceil};
    }
}