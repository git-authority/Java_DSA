import java.util.*;
public class Pattern1 {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = in.nextInt();
        int c=-1;
        for(int i=n/2+1;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
                System.out.print("*\t");
            c+=2;
            for(int k=1;k<=c;k++)
                System.out.print("\t");
            for(int j=1;j<=i;j++)
                System.out.print("*\t");
            System.out.println();
        }
        for(int i=2;i<=n/2+1;i++)
        {
            for(int j=1;j<=i;j++)
                System.out.print("*\t");
            c-=2;
            for(int k=c;k>=1;k--)
                System.out.print("\t");
            for(int j=1;j<=i;j++)
                System.out.print("*\t");
            System.out.println();
        }
    }
}
