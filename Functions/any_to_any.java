import java.util.*;
public class any_to_any {
    public static void main(String[] args) {
        // int num=0, base=0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Any Base No.: ");
        int num = in.nextInt();
        System.out.println("Enter From Base: ");
        int base1 = in.nextInt();
        System.out.println("Enter To Base: ");
        int base2 = in.nextInt();
        long req1 = any_to_dec(num, base1);
        long req2 = dec_to_any(req1, base2);
        System.out.println( num + " to the base 10 is: "  + req2);
    }

    public static long any_to_dec(int n, int b)
    {
        long r=0, c=0;
        long newno=0;
        while(n>0)
        {
            r = n%10;
            newno = newno + r*((long)(Math.pow(b,c)));
            c++;
            n=n/10;
        }
        return newno;
    }
    public static long dec_to_any(long n, int b)
    {
        long c=0;
        long newno=0;
        while(n>0)
        {
            long r = n%b;
            newno = newno + r*((long)(Math.pow(10,c)));
            c++;
            n=n/b;
        }
        return newno;
    }

}
