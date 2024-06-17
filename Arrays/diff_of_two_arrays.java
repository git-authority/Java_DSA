import java.util.*;
public class diff_of_two_arrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Size of First Array: ");
        int n1 = in.nextInt();
        System.out.println("Enter Size of Second Array: ");
        int n2 = in.nextInt();
        int size = 0, i = 0;
        if(n1>n2)
        {ṇ=
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
            System.out.println("Enter Elemnts in First Array: ");
            for(i=0; i<size; i++)
            {
                arr1[i]=in.nextInt();
            }
            System.out.println("Enter Elements in Second Array: ");
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
            System.out.println("Enter Elements in First Array: ");
            for(i=0;i<(size-n1);i++)
            {
                arr1[i]=0;
            }
            for(i=(size-n1);i<size;i++)
            {
                arr1[i]=in.nextInt();
            }
            System.out.println("Enter Elemnts in Second Array: ");
            for(i=0; i<size; i++)
            {
                arr2[i]=in.nextInt();
            }
        }
        int[] diff = new int[size+1];
        int carry = 0;

        if(arr2[i] < arr1[i])
        {
            arr2[i]+=10;
            carry = 0;
        }

        for(i=size;i>=0;i--)
        {
            diff[i+1] = ( arr2[i] + carry ) - arr1[i];
            if(arr2[i] < arr1[i])
            {
                arr2[i]+=10;
                carry = 1;
            }
            else
            {
                carry = 0;
            }
        }

        System.out.println("Diff of Respective Elements: ");
        for(i=0;i<=size;i++)
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