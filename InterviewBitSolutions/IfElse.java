import java.lang.*;
import java.util.*;

public class IfElse {
    public static void main(String[] args) {
        /***Don't change the code here***/

        Scanner inp  = new Scanner(System.in);
        int M = inp.nextInt();
        inp.close();
        /*********************************/

        /**Write your code here**/
        if(M%3 == 0 && M%5 == 0)
        {
            System.out.println("Good Number");
        }
        else if(M%3 == 0)
        {
            System.out.println("Bad Number");
        }
        else if(M%5 == 0)
        {
            System.out.println("Poor Number");
        }
        else
        {
            System.out.println(-1);
        }


    }
}