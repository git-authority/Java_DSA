public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {

        int c = 1;

        for(int i = 0; i<nums.length; i++){
            if(nums[i] != nums[c-1]){
                nums[c] = nums[i];
                c++;
            }
        }
        return c;
    }
}
