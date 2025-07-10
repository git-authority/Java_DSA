public class SingleElementInSortedArray {
    public int singleNonDuplicate(int[] nums) {

        if(nums.length==1)  return nums[0];

        if(nums[0]!=nums[1])    return nums[0];

        if(nums[nums.length-1]!=nums[nums.length-2])    return nums[nums.length-1];

        int left = 1, right = nums.length-2;

        while(left<=right){
            int mid = (left+right)>>1;

            if(nums[mid]!=nums[mid+1] && nums[mid]!=nums[mid-1]){
                return nums[mid];
            }

            // It is a case of (even, odd)
            if((mid%2==0 && nums[mid]==nums[mid+1]) || (mid%2==1 && nums[mid]==nums[mid-1])){
                left = mid + 1;
            }
            // It is a case of (odd, even)
            else{
                right = mid - 1;
            }
        }
        return -1;
    }
}
