import java.util.*;
public class any_base_multiplication {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Number 2: ");
        int num2=in.nextInt();
        System.out.println("Enter Number 1: ");
        int num1=in.nextInt();
        System.out.println("Enter Base: ");
        int base=in.nextInt();
        int i=0,netres=0,c=1;
        for(i=1;i<=count(num1);i++)
        {
            int res1=multiply(num1, num2, base);
            if(i>1)
            {
                res1*=10;
            }
            num1/=10;
            int res2=multiply(num1, num2, base);
            res2=res2*((int)(Math.pow(10,c)));
            c++;
            if(i==1)
            {
                netres= addition(res1, res2, base);
            }
            else
            {
                netres= addition(res2, netres, base);
            }
        }
        System.out.println("Result: "+netres);
    }
    public static int multiply(int n1, int n2, int b)
    {

        int dig1=extract(n1);
        int carry=0,c=0,result=0,rem=0;
        while(n2>0)
        {
            int r=n2%10;
            int prod = dig1*r;
            prod+=carry;
            rem=prod%b;
            carry=prod/b;
            n2/=10;
            result+=rem*(int)(Math.pow(10,c));
            c++;
        }
        result+=carry*(int)(Math.pow(10,c));
        return result;
    }
    public static int addition(int n1, int n2, int b)
    {
        int carry = 0, result = 0,c=0, digsum =0,digcnt=0;
        if(n1>=n2)
        {
            digcnt=count(n1);
        }
        else
        {
            digcnt=count(n2);
        }
        for(int i=1;i<=digcnt;i++)
        {
            int dig1=extract(n1);
            int dig2=extract(n2);
            digsum = dig1+dig2+carry;
            if(digsum>=b)
            {
                digsum-=b;
                carry = 1;
            }
            else
            {
                carry = 0;
            }
            result+=digsum*(int)(Math.pow(10,c));
            c++;
            n1/=10;
            n2/=10;
        }
        result+=carry*(int)(Math.pow(10,c));

        return result;
    }
    public static int extract(int n)
    {
       int r=0;
       if(n>=0)
       {
           r=n%10;
           n/=10;
       }
       else
       {
        r=0;
       }
       return r;
    }
    public static int count(int n)
    {
        int count=0;
        while(n>0)
        {
            n/=10;
            count++;
        }
        return count;
    }
}