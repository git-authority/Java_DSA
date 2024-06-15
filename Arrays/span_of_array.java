import java.util.*;
public class span_of_array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter N: ");
        int n=in.nextInt();
        System.out.println("Enter Elements into Array: ");
        int[] arr= new int[n];
        for(int i = 0; i<n; i++)
        {
            arr[i]=in.nextInt();
        }
        System.out.println("Difference: "+((max(arr,n)) - min(arr,n)));
    }
    public static int min(int arr[],int n)
    {
        int minimum=arr[0];
        for(int i=1;i<n;i++)
        {
            if(arr[i]<minimum)
            {
                minimum=arr[i];
            }
        }
        return minimum;
    }
    public static int max(int arr[],int n)
    {
        int maximum=arr[0];
        for(int i=1;i<n;i++)
        {
            if(arr[i]>maximum)
            {
                maximum=arr[i];
            }
        }
        return maximum;
    }
}
