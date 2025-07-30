public class CountSubsequenceSumK {
    public int countSubsequenceWithTargetSum(int[] nums, int k) {
        //your code goes here
        return countSubset(0, nums, k);
    }

    private int countSubset(int i, int[] nums, int k){

        if(k==0){
            return 1;
        }


        if(i == nums.length || k<0){
            return 0;
        }

        // Include the current number and move forward
        int path1 = countSubset(i+1, nums, k-nums[i]);

        // Don't include the current number and move forward
        int path2 = countSubset(i+1, nums, k);

        return path1+path2;

    }
}
