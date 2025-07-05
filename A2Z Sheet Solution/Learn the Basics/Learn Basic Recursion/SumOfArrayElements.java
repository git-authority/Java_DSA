public class SumOfArrayElements {
    public int arraySum(int[] nums) {
        //your code goes here
        return sum(nums, 0);
    }

    private int sum(int[] nums, int c){
        if(c>=nums.length){
            return 0;
        }
        else{
            return nums[c] + sum(nums, c+1);
        }
    }
}
