public class Solution {
    public static void nLetterTriangle(int n) {
        // Write your code here
        // int ch='A';
        for(int i = 65;i<65+n;i++)
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
