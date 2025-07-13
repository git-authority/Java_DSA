public class AllocatePages {
    public int findPages(int[] nums, int m) {

        // Edge case
        if(nums.length<m)   return -1;

        int low = Integer.MIN_VALUE;
        int high = 0;
        for(int i =0 ;i<nums.length;i++){
            high+=nums[i];
            low = Math.max(low, nums[i]);
        }

        // low = Math.max(low, nums[nums.length-1]);

        while(low<=high){
            int mid = low+(high-low)/2;

            int studentCount = countStudents(nums, mid, m);

            if(studentCount<=m){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }

        return low;

    }

    private int countStudents(int[] nums, int mid, int m){

        int totalStudents = 1;
        int count = nums[0];

        for(int i = 1;i<nums.length;i++){

            if(nums[i]+count>mid){
                count = nums[i];
                totalStudents++;
            }
            else{
                count+=nums[i];
            }
        }

        return totalStudents;
    }
}
