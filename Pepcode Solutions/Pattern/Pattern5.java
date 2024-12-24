import java.util.*;
public class Pattern5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i=0,j=0,k=0,f=0,n=0,sp=0;
        System.out.println("Enter N: ");
        n=in.nextInt();
        sp=n/2;
        k=2;
        for(i=1;i<=n/2;i++)
        {
            for(j=1;j<=sp;j++)
            {
                System.out.print("\t");
            }
            k=i;
            for(j=1;j<=i;j++)
            {
                System.out.print(k+"\t");
                k++;
            }
            f=k-2;
            for(j=1;j<i;j++)
            {
                System.out.print(f+"\t");
                f++;
            }
            sp--;
            k++;
            System.out.println();
        }
        for(i=n/2+1;i>=1;i--)
        {
            for(j=1;j<=sp;j++)
            {
                System.out.print("\t");
            }
            k=i;
            for(j=1;j<=i;j++)
            {
                System.out.print(k+"\t");
                k++;
            }
            f=k-2;
            for(j=1;j<i;j++)
            {
                System.out.print(f+"\t");
                f--;
            }
            sp++;
            k--;
            System.out.println();
        }
    }
}