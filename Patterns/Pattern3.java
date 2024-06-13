import java.util.*;
public class Pattern3 {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int n=0,sp=0,st=0,i=0,j=0;
        System.out.println("Enter N: ");
        n=in.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                if(i==j||i+j==n+1)
                    System.out.print("*\t");
                else
                    System.out.print("\t");
            }
            System.out.println();
        }
    }

}
