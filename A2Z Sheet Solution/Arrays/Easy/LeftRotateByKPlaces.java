class LeftRotateByKPlaces {
    public void rotateArray(int[] nums, int k) {

        int n = nums.length;

        k = k%n;

        // Reverse first k elements
        reverseArray(nums, 0, k-1);

        // Reverse remanining elements
        reverseArray(nums, k, n-1);

        // Now reverse the entire modified array
        reverseArray(nums, 0, n-1);

    }

    public void reverseArray(int[] nums, int start, int end){
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}