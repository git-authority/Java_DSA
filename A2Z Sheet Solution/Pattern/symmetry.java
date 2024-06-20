public class Solution {
    public static void symmetry(int n) {
        // Write your code here
        int i = 0, j = 0, sp = 0;
        for(i=n;i>=1;i--)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            for(j=1;j<=sp;j++)
            {
                System.out.print("  ");
            }
            for(j=1;j<=sp;j++)
            {
                System.out.print("  ");
            }
            sp++;
            for(j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            for(j=1;j<=sp;j++)
            {
                System.out.print("  ");
            }
            for(j=1;j<=sp;j++)
            {
                System.out.print("  ");
            }
            sp--;
            for(j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
