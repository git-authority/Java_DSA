class Compute {
    
    public int largest(int arr[], int n)
    {
        int max = arr[0];
        int i = 0;
        for(i=1;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max = arr[i];
            }
        }
        return max;
    }
}
