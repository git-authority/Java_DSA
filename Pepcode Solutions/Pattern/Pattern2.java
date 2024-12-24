import java.util.*;
public class Pattern2 {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter N: ");
        int n=in.nextInt();
        int i=0,j=0,sp=0,st=0;
        sp=n/2;
        st=1;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=sp;j++)
            {
                System.out.print("\t");
            }
            for(j=1;j<=st;j++)
            {
                System.out.print("*\t");
            }
            if(i<=n/2)
            {
                sp--;
                st+=2;
            }
            else
            {
                sp++;
                st-=2;
            }
            System.out.println();
        }
    }

}
