public class Solution {
    public static void symmetry(int n) {
        // Write your code here
        int i = 0, sp = (n-1), j = 0;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            for(j=sp;j>=1;j--)
            {
                System.out.print("  ");
            }
            for(j=sp;j>=1;j--)
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
        sp++;
        for(i=n-1;i>=1;i--)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            for(j=sp;j>=1;j--)
            {
                System.out.print("  ");
            }
            for(j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            sp++;
            System.out.println();
        }
    }
}
