import java.util.*;
public class permutation_calculate {

    public static int fact(int n)
    {
        int facto=1;
        for(int i=1;i<=n;i++)
        {
            facto*=i;
        }
        return facto;
    }

    public static void display(int x, int y, int val)
    {
        System.out.println(x+"P"+y+" = "+val);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner( System.in );
        int n = in.nextInt();
        int r = in.nextInt();
        int npr=fact(n);
        int npmr=fact(n-r);
        int value=npr/npmr;
        display(n,r,value);
    }

}
