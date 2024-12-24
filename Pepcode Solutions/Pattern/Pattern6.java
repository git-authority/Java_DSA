import java.util.*;
public class Pattern6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=0,st=0,sp=0,i=0,j=0;
        System.out.println("Enter N: ");
        n=in.nextInt();
        sp=n-2;
        int isp=n/2-1,osp=-1;
        st=1;
        for(i=1;i<=n/2;i++)
        {
            System.out.print("*\t");
            for(j=1;j<=sp;j++)
            {
                System.out.print("\t");
            }
            System.out.print("*\t");
            System.out.println();
        }
        for(i=n/2+1;i<=n;i++)
        {
            System.out.print("*\t");
            for(j=1;j<=isp;j++)
            {
                System.out.print("\t");
            }
            if(i>=n/2+1 && i<n)
            {
                System.out.print("*\t");
            }
            for(j=1;j<=osp;j++)
            {
                System.out.print("\t");
            }
            if(i>n/2+1 && i<n)
            {
                System.out.print("*\t");
            }
            for(j=1;j<=isp;j++)
            {
                System.out.print("\t");
            }
            System.out.print("*\t");
            System.out.println();
            isp--;
            osp+=2;
        }
    }
}