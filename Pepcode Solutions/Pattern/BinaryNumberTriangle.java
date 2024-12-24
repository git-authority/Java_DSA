class Solution {
    public static void nBinaryTriangle(int n) {
        // Write your code here.
        int i = 0, j = 0, c = 0;
        for(i=1;i<=n;i++)
        {
            if(i%2==0)
            {
                c=0;
            }
            else{
                c=1;
            }
            for(j=1;j<=i;j++)
            {
                System.out.print(c + " ");
                if(c==1)
                {
                    c--;
                }
                else
                {
                    c++;
                }
            }
            System.out.println();
        }
    }
}
