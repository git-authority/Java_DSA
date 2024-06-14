import java.lang.*;
import java.util.*;

public class Methods {
    public static void main(String[] args) {

        /*Dont't touch the code in this block*/
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        inp.nextLine();
        int b = inp.nextInt();
        inp.nextLine();
        inp.close();
        System.out.println(add(a,b));
        System.out.println(multiply(a,b));
        /*******************************************/
    }

    //Your code goes here
    public static int add(int m, int n)
    {
        int sum=m+n;
        return sum;
    }
    public static int multiply(int m, int n)
    {
        int prod=m*n;
        return prod;
    }

}