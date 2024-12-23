class GCD {
    static Long[] lcmAndGcd(Long A , Long B) {
        // code here
        long i = 0, gcd = 1, n1 = A, n2 = B;

        while(A>0 && B>0)
        {
            if(A>B)
            {
                A = A % B;
            }
            else
            {
                B = B % A;
            }
        }

        if(B == 0)
        {
            gcd = A;
        }
        else if ( A == 0)
        {
            gcd = B;
        }
        long lcm = n1*n2 / gcd;

        return new Long[]{lcm, gcd};
    }
}
