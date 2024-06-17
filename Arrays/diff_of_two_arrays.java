import java.util.*;
public class diff_of_two_arrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Size of Lower Array: ");
        int n1 = in.nextInt();
        System.out.println("Enter Size of Upper Array: ");
        int n2 = in.nextInt();
        int size = 0, i = 0;
        if(n1>n2)
        {
            size = n1;
        }
        else
        {
            size = n2;
        }
        int[] arr1 = new int [size];
        int[] arr2 = new int [size];
        if(n1>n2)
        {
            System.out.println("Enter Elements in Lower: ");
            for(i=0; i<size; i++)
            {
                arr1[i]=in.nextInt();
            }
            System.out.println("Enter Elements in Upper Array: ");
            for(i=0;i<(size-n2);i++)
            {
                arr2[i]=0;
            }
            for(i=(size-n2);i<size;i++)
            {
                arr2[i]=in.nextInt();
            }
        }
        else
        {
            System.out.println("Enter Elements in Lower Array: ");
            for(i=0;i<(size-n1);i++)
            {
                arr1[i]=0;
            }
            for(i=(size-n1);i<size;i++)
            {
                arr1[i]=in.nextInt();
            }
            System.out.println("Enter Elemnts in Upper Array: ");
            for(i=0; i<size; i++)
            {
                arr2[i]=in.nextInt();
            }
        }
        int[] diff = new int[size];

        for(i=size-1;i>0;i--)
        {
            if(arr2[i] < arr1[i])
            {
                arr2[i]+=10;
                arr1[i-1] += 1;
            }
            diff[i] = arr2[i] - arr1[i];
        }
        diff[i] = arr2[i] - ( arr1[i] );
        System.out.println("Diff of Respective Elements: ");
        for(i=0;i<size;i++)
        {
            if(diff[i] == 0 && i == 0)
            {
                continue;
            }
            else
            {
                System.out.println(diff[i]);
            }
        }
    }
}