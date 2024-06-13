import java.util.*;
public class rotate {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Number and Number of Rotations: ");
        int n = in.nextInt();
        int k = in.nextInt();
        int New=0,num=0,n1=0,c=0,p=0;
        num=n;
        while(num!=0)
        {
            n1=num%10;
            num=num/10;
            c++;
        }
        System.out.println(c);
        n1=0;
        num=n;
        if(k<0)
            k++;
        k=(Math.abs(k%c));
        // if(k>0)
        // {
        //     p=k;
        // }
        // else if(k<0)
        // {
        //     p=c+k;
        // }
        p=k;
        if(p==0)
            New=num;
        for(int i=1;i<=p;i++)
        {
            n1=num%10;
            num=num/10;
            New = num+n1*(int)(Math.pow(10.0,(double)c-1));
            num=New;
        }
        System.out.println("New Number :"+New);
    }

}
