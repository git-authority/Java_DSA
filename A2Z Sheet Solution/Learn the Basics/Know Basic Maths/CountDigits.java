class CountDigits{
    static int evenlyDivides(int N){
        // code here
        int c=0, num=0,r=0;
        num=N;
        while(N!=0)
        {
            r=N%10;
            N/=10;
            if(r!=0 && num%r==0)
            {
                c++;
                // break;
            }
            // else
            //     c++;
        }
        return c;
    }
}
