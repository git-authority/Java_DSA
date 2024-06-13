import java.util.*;
public class Pattern4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=0,i=0,j=0,st=0,osp=0,isp=0;
        System.out.println("Enter N: ");
        n=in.nextInt();
        osp=n/2+1;
        isp=-1;
        for(i=1;i<=n/2;i++)
        {
            for(j=1;j<=osp;j++)
            {
                System.out.print("\t");
            }

            System.out.print("*\t");

            for(j=1;j<=isp;j++)
            {
                if(j!=isp)
                System.out.print("\t");
                else
                System.out.print("\t*");
            }
            osp--;
            isp+=2;
            System.out.println();
        }
        for(;i<=n;i++)
        {
            for(j=1;j<=osp;j++)
            {
                System.out.print("\t");
            }
            System.out.print("*\t");
            for(j=1;j<=isp;j++)
            {
                if(j!=isp)
                System.out.print("\t");
                else
                System.out.print("\t*");
            }
        osp++;
        isp-=2;
        System.out.println();
        }
    }
}
