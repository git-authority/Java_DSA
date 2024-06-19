public class Solution {
    public static void nLetterTriangle(int n) {
        // Write your code here

        for(int i = 65+n-1;i>=65;i--)
        {
            for(int j = 65; j<=i;j++)
            {
                char ch = (char)j;
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
}
