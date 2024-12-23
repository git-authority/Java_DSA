class ReverseNumber {
    public int reverse(int x) {
        int r=0;
        long num=0;
        while(x!=0)
        {
            r=x%10;
            num=num*10+r;
            x/=10;
            if (num > Integer.MAX_VALUE || num < Integer.MIN_VALUE)
                return 0;
        }
        return (int) num;
    }
}
