import java.lang.*;
import java.util.*;

public class revarray {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner in = new Scanner(System.in);
        // System.out.println("Enter N: ");
        int N = in.nextInt();
        int[] arr = new int[N];
        int i = 0;
        // System.out.println("Enter Array Elements: ");
        for(i = 0 ; i<N ; i++)
        {
            arr[i]=in.nextInt();
        }
        int j = N-1, t = 0;
        i=0;
        while(i<N/2)
        {
            t = arr[j];
            arr[j] = arr[i];
            arr[i] = t;
            i++;
            j--;
        }
        // System.out.println("Reversed Array Elements: ");
        for(i = 0 ; i<N ; i++)
        {
            System.out.println(arr[i]);
        }
    }
}
