import java.util.*;
public class find_element {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Size of Array: ");
        int n=in.nextInt();
        int[] a= new int [n];
        System.out.println("Enter Element to be Searched: ");
        int d=in.nextInt();
        int f = 0;
        int i = 0;
        System.out.println("Enter Elements into Array: ");
        for(i = 0; i<n ; i++)
        {
            a[i] = in.nextInt();
        }
        for(i = 0; i<n ; i++)
        {
            if(a[i] == d)
            {
                f=1;
                break;
            }
        }
        if(f==1)
        {
            System.out.println(i);
        }
        else
        {
            System.out.println(-1);
        }
    }
}
