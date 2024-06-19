public class Solution {
    public static void numberCrown(int n) {
        // Write your code here.
        int sp = 0;
        int i = 0, j = 0, k = 0;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            for(j=1;j<=((n-i)*2);j++)
            {
                System.out.print("  ");
            }
            // j-=2;
            for(k=i;k>=1;k--)
            {
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}
