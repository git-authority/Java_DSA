import java.util.*;

public class While {
    public static void main(String args[]) {
        // Your Code Here
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 10;
        while(count>0){
            System.out.print(count*n+" ");
            count--;
        }
    }
}