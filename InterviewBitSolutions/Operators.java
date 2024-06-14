import java.lang.*;
import java.util.*;

public class Operators {
    public static void main(String[] args) {

    /***Don't change anything here***/
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        inp.nextLine();
        int b = inp.nextInt();
        inp.nextLine();
        inp.close();
    /*********************************/

    /*Perform the task here*/

        int add=a+b;
        int sub=a-b;
        int multi=a*b;
        int div=a/b;

    /***********************/

    /******Don't change anything here******/
        System.out.println(add);
        System.out.println(sub);
        System.out.println(multi);
        System.out.println(div);

    }
}