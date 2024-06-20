public class Solution {
    public static void getStarPattern(int n) {
        // Write your code here
        int i = 0, j = 0, sp = n-2;
        for(i=1;i<=n;i++)
        {
            System.out.print("*");
        }
        System.out.println();
        for(i=1;i<=n-2;i++)
        {
            System.out.print("*");
            for(j=1;j<=sp;j++)
            {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
        if(n>1)
        {
            for(i=1;i<=n;i++)
            {
                System.out.print("*");
            }
        }
    }
}
