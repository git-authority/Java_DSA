
class Solution
{
  static long sumOfDivisors(int N)
  {
        // code here
        int i = 0, j = 0; 
        long div = 0;
        for(i=1;i<=N;i++)
        {
            for(j=1;j<=((int)Math.sqrt(i));j++)
            {
                if(i%j == 0)
                {
                    div+=j;
                    if(j!=i/j)
                    {
                        div+=i/j;
                
                    }
                }
            }
        }
        return div;
    }
}
