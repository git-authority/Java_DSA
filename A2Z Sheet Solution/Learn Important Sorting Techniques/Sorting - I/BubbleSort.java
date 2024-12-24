class BubbleSort {
    // Function to sort the array using bubble sort algorithm.
    public static void bubbleSort(int arr[]) {
        // code here
        int didSwap = 0;
        for(int i = arr.length - 2; i>=0; i--){
            for(int j = 0; j<=i; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    didSwap = 1;
                }
            }
            if(didSwap == 0){
                break;
            }
        }
    }
}