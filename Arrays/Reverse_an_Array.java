import java.util.*;
public class Reverse_an_Array {
    public static void main(String[] args) {
        Scanner in = new Scanner ( System.in );
        System.out.println("Enter No. of Elements: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Elements in Array: ");
        int i = 0;
        for(i=0;i<n;i++)
        {
            arr[i] = in.nextInt();
        }
        int j = n-1, t = 0;
        i=0;
        while(i<j)
        {
            t = arr[i];
            int temp = arr[j];
            arr[i]=temp;
            arr[j]=t;
            j--;
            i++;
        }

        System.out.println("Reversed Array: ");
        for(i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
