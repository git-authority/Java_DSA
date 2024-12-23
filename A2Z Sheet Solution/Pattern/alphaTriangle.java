class Solution {
    public static void alphaTriangle(int n) {
        // Write your code here
        int i = 0,j = 0;
        for(i=65+n-1;i>=65;i--)
        {
            for(j=65+n-1; j>=i ;j--)
            {
                System.out.print((char)j+ " ");
            }
            System.out.println();
        }
    }
}
