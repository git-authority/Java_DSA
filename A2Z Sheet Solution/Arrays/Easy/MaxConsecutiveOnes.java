public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int c = 0, i = 0, result = 0;

        for(i = 0; i <nums.length; i++){
            if(nums[i] == 1){
                c++;
            }
            else{
                result = Math.max(result, c);
                c = 0;
            }
        }

        result = Math.max(result, c);

        return result;
    }
}
