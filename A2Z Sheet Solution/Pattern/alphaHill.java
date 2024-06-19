public class Solution {
    public static void alphaHill(int n) {
        // Write your code here
        int sp = n-1;
        int i = 0, j = 0;
        for(i = 65;i<65+n;i++)
        {
            for(j=1;j<=sp;j++)
            {
                System.out.print(" ");
            }
            sp--;
            for(j=65;j<=i;j++)
            {
                System.out.print((char)j+" ");
            }
            for(j=i-1;j>=65;j--)
            {
                System.out.print((char)j+" ");
            }
            System.out.println();
        }
    }
}
