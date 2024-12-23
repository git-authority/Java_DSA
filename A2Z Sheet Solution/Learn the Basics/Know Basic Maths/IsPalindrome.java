class IsPalindrome {
    public boolean isPalindrome(int x) {
        int num = x, rev = 0, r = 0;
        if(x<0)
        {
            return false;
        }
        else if(x==0)
        {
            return true;
        }
        else
        {
            while(x>0)
            {
                r=x%10;
                rev = rev*10+r;
                x/=10;
            }
            if(rev==num)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
    }
}
