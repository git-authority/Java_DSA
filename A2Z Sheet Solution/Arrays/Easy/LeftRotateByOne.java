public class LeftRotateByOne {
    public void rotateArrayByOne(int[] nums) {

        // If only one or no element exists in array then
        // we don't do anything
        if(nums.length>1){

            // Handling first element
            int firstElement = nums[0];

            // Handling remaining elements
            for(int i = 1; i<nums.length; i++){
                nums[i-1] = nums[i];
            }

            // Handling last element
            nums[nums.length-1] = firstElement;
        }
    }
}
