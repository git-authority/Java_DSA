class Solution {
    static String armstrongNumber(int n) {
        // code here
        int num = n, sum = 0;
        while(n>0)
        {
            int r = n % 10;
            sum+= r*r*r;
            n/=10;
        }
        if(num == sum)
        {
            return "true";
        }
        else
        {
            return "false";
        }
    }
}
