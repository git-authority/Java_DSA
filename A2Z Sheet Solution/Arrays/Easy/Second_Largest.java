class Second_Largest {
    int print2largest(int arr[], int n) {
        // code here

        int i = 0;
        int seclar = Integer.MIN_VALUE;
        int largest = arr[0];
        for(i=1;i<arr.length;i++)
        {
            if(arr[i]>largest && seclar<largest)
            {
                seclar = largest;
                largest = arr[i];
            }
            else if(arr[i]<largest && arr[i]>seclar)
            {
                seclar = arr[i];
            }

        }
        if(seclar == Integer.MIN_VALUE)
            return -1;
        else
            return seclar;
    }
}
