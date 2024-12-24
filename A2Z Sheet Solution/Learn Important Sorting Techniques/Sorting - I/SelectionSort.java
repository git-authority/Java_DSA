class SelectionSort {
    void selectionSort(int[] arr) {
        // code here

        for(int i = 0; i<arr.length; i++){
            int min = i;
            // Inner Loop is used for finding the minimum element and swapping starting from (i+1)th index
            for(int j = i + 1; j<arr.length; j++){
                if(arr[j]<arr[min]){
                    int temp = arr[j];
                    arr[j] = arr[min];
                    arr[min] = temp;
                }
            }
        }
    }
}