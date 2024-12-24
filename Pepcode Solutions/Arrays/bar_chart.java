import java.util.*;
public class bar_chart {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter No. of Bars: ");
        int bars = in.nextInt();
        int[] arr = new int[bars];
        int max = 0;
        System.out.println("Enter Values: ");
        for(int i = 0; i < bars ; i++)
        {
            arr[i] = in.nextInt();
        }
        for(int i = 0; i < bars ; i++)
        {
            if( arr[i] > max)
            {
                max = arr[i];
            }
        }
        for(int i = max; i>=1 ; i--)
        {
            for( int j = 0; j<bars; j++)
            {
                if(arr[j]>=i)
                {
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
        System.out.println();
        }
    }
}
