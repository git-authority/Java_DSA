class Solution {
    public static void nNumberTriangle(int n) {
        // Write your code here
        int i = 0, j = 0, c = 1;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(c+" ");
                c++;
            }
            System.out.println();
        }
    }
}
