class ReverseArray {
    public void reverseArray(int arr[]){
        // code here
        reverse(arr, 0, arr.length-1);
    }

    public void reverse(int arr[], int start, int end){
        // code here
        if (start < end) {
        int tmp = arr[start];
        arr[start] = arr[end];
        arr[end] = tmp;
        reverse(arr, start + 1, end - 1);
      }
    }
}