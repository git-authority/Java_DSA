class Solution {
    public static void getNumberPattern(int n) {
        // Write your code here.
        int i = 0, j = 0, rep = (n*2)-1;
        for(i=n;i>=1;i--)
        {
            for(j=n;j>=i;j--)
            {
                System.out.print(j);
            }
            for(j=rep-2;j>=1;j--)
            {
                System.out.print(i);
            }
            rep-=2;
            for(j=i;j<=n && j>=2;j++)
            {
                System.out.print(j);
            }
            if(i==1)
            {
                for(j=2;j<=n;j++)
                {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
        rep+=2;
        for(i=2;i<=n;i++)
        {
            for(j=n;j>=i;j--)
            {
                System.out.print(j);
            }
            for(j=1;j<=rep;j++)
            {
                System.out.print(i);
            }
            rep+=2;
            for(j=i;j<=n;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
