class PeakElement {
    public int findPeakElement(int[] arr) {

    int low = 0;
    int high = arr.length-1;

    while(low<high){            // Note not <=
        int mid = low + (high-low)/2;

        if(arr[mid]>arr[mid+1]){
            high = mid;
        }
        else{
            low = mid + 1;
        }
    }

    return low;

    }
}