class Solution{
    static int searchInSorted(int arr[], int N, int K)
    {
        
        // Your code here
        int flag = 0;
        for(i=0;i < N; i++)
        {
            if(arr[i]==K)
            {
                flag = 1;
                break;
            }
        }
        if(flag == 1)
            return 1;
        else
            return -1;
    }
}
