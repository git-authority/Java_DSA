class Solution {
    public static void nStarDiamond(int n) {
        // Write your code here
        int i=0,j=0,c=n-1;
        for(i=1;i<=n;i++)
        {
            for(j=c;j>=1;j--)
            {
                System.out.print(" ");
            }
            c--;
            for(int k = 1;k<2*i;k++)
            {
                System.out.print("*");
            }
            System.out.print(" ");
            System.out.println();
        }
        c=0;
        for(i=n;i>=1;i--)
        {
            for(j=c;j>=1;j--)
            {
                System.out.print(" ");
            }
            c++;
            for(int k = 1;k<2*i;k++)
            {
                System.out.print("*");
            }
            System.out.print(" ");
            System.out.println();
        }
    }
}
